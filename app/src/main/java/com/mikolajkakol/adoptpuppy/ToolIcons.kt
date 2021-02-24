package com.mikolajkakol.adoptpuppy

import android.content.Intent
import androidx.compose.animation.Crossfade
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.twotone.Share
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

@Composable
fun FavouriteIcon() {
    val favourite = remember { mutableStateOf(false) }
    IconButton(onClick = { favourite.value = favourite.value.not() }) {
        Crossfade(targetState = favourite.value) {
            Icon(
                imageVector = if (it) Icons.Filled.Favorite else Icons.Outlined.FavoriteBorder,
                tint = Color(0xffF44336),
                contentDescription = "Add to favourite",
            )
        }
    }
}

@Composable
fun ShareIcon(cutie: Cutie) {
    val context = LocalContext.current
    IconButton(onClick = {
        val intent = Intent.createChooser(
            Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(
                    Intent.EXTRA_TEXT,
                    "Check out this cutie I found. It's called ${cutie.name}"
                )
                type = "text/plain"
            },
            null
        )
        context.startActivity(intent)
    }) {
        Icon(
            imageVector = Icons.TwoTone.Share,
            contentDescription = "Share with friend",
        )
    }
}