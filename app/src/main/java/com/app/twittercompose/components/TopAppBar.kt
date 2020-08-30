package com.app.twittercompose.components

import androidx.compose.foundation.Icon
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.Menu
import androidx.compose.material.icons.sharp.StarOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.app.twittercompose.R
import com.app.twittercompose.components.SeparatorSpacer

@Composable
fun TopAppBar() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        SeparatorSpacer(
            modifier = Modifier.padding(top = 28.dp)
        )
        Row(
            modifier = Modifier.padding(14.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                asset = Icons.Sharp.Menu
            )
            Icon(
                asset = imageResource(id = R.drawable.ic_twitter_icon)
            )
            Icon(
                asset = Icons.Sharp.StarOutline
            )
        }
    }
}