package com.app.twittercompose.drawer

import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.twittercompose.components.*
import com.app.twittercompose.state.DrawerUiState
import com.app.twittercompose.state.Profile

@Composable
fun NavDrawer(
    uiState: DrawerUiState,
    openMyProfile: (Profile) -> Unit,
) {
    Surface(color = MaterialTheme.colors.background) {
        ScrollableColumn(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            Column(
                modifier = Modifier.padding(start = 15.dp, end = 15.dp)
                    .fillMaxWidth()
            ) {
                SeparatorSpacer(modifier = Modifier.height(35.dp))
                CircularImage(
                    image = imageResource(id = uiState.myProfile.userProfilePic),
                    modifier = Modifier.preferredSize(80.dp)
                )
                SeparatorSpacer()
                Text(
                    text = uiState.myProfile.userName,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = uiState.myProfile.userAccountHandle,
                    fontSize = 14.sp,
                )
                SeparatorSpacer()
                Row(
                    horizontalArrangement = Arrangement.Start.also { Arrangement.Center },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    ProfileFollowDataView(uiState.myProfile.userFollowersCount, "Followers")
                    SeparatorSpacer(modifier = Modifier.width(15.dp))
                    ProfileFollowDataView(uiState.myProfile.userFollowingCount, "Following")
                }
            }
            SeparatorDivider()
            LazyColumnFor(items = uiState.drawerData) { item ->
                DrawerMenuOptionItem(
                    icon = item.drawerItemIcon,
                    listLabel = item.drawerItemLabel
                )
            }
            SeparatorDivider()
            LazyColumnFor(items = uiState.drawerAppOptions) { item ->
                DrawerMenuOptionItem(
                    icon = item.drawerItemIcon,
                    listLabel = item.drawerItemLabel
                )
            }
        }
    }
}