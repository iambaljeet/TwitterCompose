package com.app.twittercompose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.ListItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.twittercompose.ui.getIconColor

@Composable
fun SeparatorSpacer(modifier: Modifier = Modifier.height(10.dp)) {
   Spacer(modifier = modifier)
}

@Composable
fun SeparatorDivider(modifier: Modifier = Modifier.fillMaxWidth(), thickness: Dp = 1.dp) {
    SeparatorSpacer()
    Divider(
        modifier = modifier,
        thickness = thickness,
    )
    SeparatorSpacer()
}

@Composable
fun DrawerMenuOptionItem(modifier: Modifier = Modifier.fillMaxWidth(), icon: VectorAsset?, listLabel: String) {
    if (icon != null) {
        ListItem(
            modifier = modifier,
            icon = { Image(asset = icon, colorFilter = ColorFilter.tint(getIconColor())) },
            text = { Text(text = listLabel) },
        )
    } else {
        ListItem(
            modifier = modifier,
            text = { Text(text = listLabel) },
        )
    }
}

@Composable
fun ProfileFollowDataView(count: Int, label: String) {
    return Row {
        Text(
            text = count.toString(),
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = label,
            fontSize = 14.sp,
        )
    }
}