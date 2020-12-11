package com.app.twittercompose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale

@Composable
fun CircularImage(modifier: Modifier, image: ImageBitmap) {
    Image(bitmap = image,
            modifier = Modifier.clickable(onClick = {})
                    .clip(CircleShape)
                    then modifier,
            contentScale = ContentScale.Crop)
}