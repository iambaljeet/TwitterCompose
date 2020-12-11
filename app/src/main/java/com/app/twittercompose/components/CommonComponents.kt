package com.app.twittercompose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.ListItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.twittercompose.ui.getIconColor

@Composable
fun SeparatorSpacer(modifier: Modifier = Modifier) {
   Spacer(modifier = modifier.height(10.dp))
}

@Composable
fun SeparatorDivider(modifier: Modifier = Modifier, thickness: Dp = 1.dp) {
    SeparatorSpacer()
    Divider(
        modifier = modifier.fillMaxWidth(),
        thickness = thickness,
    )
    SeparatorSpacer()
}

@Composable
fun DrawerMenuOptionItem(modifier: Modifier = Modifier, icon: ImageVector?, listLabel: String) {
    if (icon != null) {
        ListItem(
            modifier = modifier.fillMaxWidth(),
            icon = { Image(imageVector = icon, colorFilter = ColorFilter.tint(getIconColor())) },
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