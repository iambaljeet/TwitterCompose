package com.app.twittercompose.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.preferredSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageAsset
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp

@Composable
fun CircularImage(modifier: Modifier, image: ImageAsset) {
    Image(asset = image,
            modifier = Modifier.clickable(onClick = {})
                    .clip(CircleShape)
                    then modifier,
            contentScale = ContentScale.Crop)
}