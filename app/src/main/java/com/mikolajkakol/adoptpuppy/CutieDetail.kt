package com.mikolajkakol.adoptpuppy

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mikolajkakol.adoptpuppy.ui.theme.AdoptPuppyTheme

@Composable
fun CutieDetail(cutie: Cutie) {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
    ) {
        Image(
            painter = painterResource(id = cutie.imageRes),
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxWidth(),
            contentDescription = "Picture of ${cutie.name}"
        )

        Column(
            modifier = Modifier
                .padding(all = 16.dp),
        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp, vertical = 4.dp),
            ) {

                FavouriteIcon()
                ShareIcon(cutie)
            }

            Text(
                text = cutie.description,
                style = MaterialTheme.typography.body2
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CutieDetailDefaultPreview() {
    AdoptPuppyTheme() {
        CutieDetail(cutie = Cutie.cuties[0])
    }
}