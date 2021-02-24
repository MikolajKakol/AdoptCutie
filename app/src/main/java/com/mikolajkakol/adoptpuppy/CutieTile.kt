package com.mikolajkakol.adoptpuppy

import android.content.Intent
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.twotone.Share
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mikolajkakol.adoptpuppy.ui.theme.AdoptPuppyTheme

@Composable
fun CutieTile(cutie: Cutie, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .padding(all = 8.dp),
        elevation = 8.dp
    ) {

        Column(
            modifier = Modifier
                .clickable { onClick() },
        ) {
            Text(
                text = cutie.name,
                modifier = Modifier.padding(
                    horizontal = 16.dp,
                    vertical = 4.dp,
                ),
                style = MaterialTheme.typography.h5
            )

            Image(
                painter = painterResource(id = cutie.imageRes),
                contentDescription = "Picture of ${cutie.name}"
            )

            Text(
                text = cutie.description,
                modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp),
                maxLines = 3,
                overflow = TextOverflow.Ellipsis,
                style = MaterialTheme.typography.body2
            )

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
        }
    }
}


@Preview(showBackground = true)
@Composable
fun CutieTileDefaultPreview() {
    AdoptPuppyTheme() {
        CutieTile(cutie = Cutie.cuties[0]) {}
    }
}