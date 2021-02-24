package com.mikolajkakol.adoptpuppy

import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.mikolajkakol.adoptpuppy.ui.theme.AdoptPuppyTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdoptPuppyTheme {
                val selectedCutie = remember { mutableStateOf<Cutie?>(null) }
                val currentSelectedCutie = selectedCutie.value

                val backCallback = remember {
                    object : OnBackPressedCallback(false) {
                        override fun handleOnBackPressed() {
                            selectedCutie.value = null
                            isEnabled = false
                        }
                    }
                }
                DisposableEffect(onBackPressedDispatcher) {
                    onBackPressedDispatcher.addCallback(backCallback)
                    onDispose { backCallback.remove() }
                }

                Scaffold(
                    topBar = { TopBar(currentSelectedCutie) }
                ) {
                    Surface(
                        color = MaterialTheme.colors.background,
                    ) {

                        Crossfade(targetState = currentSelectedCutie) {
                            if (it == null) {
                                LazyVerticalGrid(
                                    cells = GridCells.Fixed(2),
                                    modifier = Modifier.padding(8.dp),
                                    content = {
                                        items(Cutie.cuties.size) { index ->
                                            val cutie = Cutie.cuties[index]
                                            CutieTile(cutie) {
                                                selectedCutie.value = cutie
                                                backCallback.isEnabled = true
                                            }
                                        }
                                    }
                                )
                            } else {
                                CutieDetail(cutie = it)
                            }
                        }
                    }
                }
            }
        }
    }

    @Composable
    private fun TopBar(cutie: Cutie?) {
        TopAppBar {
            Row(
                Modifier
                    .padding(horizontal = 8.dp)
                    .fillMaxHeight(),
                verticalAlignment = Alignment.CenterVertically,
            ) {

                AnimatedVisibility(visible = cutie != null) {
                    IconButton(onClick = { onBackPressed() }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            tint = Color.Black,
                            contentDescription = "Close app"
                        )
                    }
                }

                Crossfade(targetState = cutie?.name ?: "Find your cutie") {
                    Text(
                        text = it,
                        style = MaterialTheme.typography.h6,
                        color = Color.Black,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                    )
                }
            }
        }
    }
}
