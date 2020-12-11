package com.app.twittercompose.state

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.vector.ImageVector

class DrawerUiState(
    myProfile: Profile,
    drawerOptions: List<DrawerItemsData>,
    drawerAppOptions: List<DrawerItemsData>,
) {
    private val _myProfiles: MutableState<Profile> =
        mutableStateOf(myProfile)
    val myProfile: Profile = _myProfiles.value

    private val _drawerData: MutableList<DrawerItemsData> =
        mutableStateListOf(*drawerOptions.toTypedArray())
    val drawerData: List<DrawerItemsData> = _drawerData

    private val _drawerAppOptions: MutableList<DrawerItemsData> =
        mutableStateListOf(*drawerAppOptions.toTypedArray())
    val drawerAppOptions: List<DrawerItemsData> = _drawerAppOptions
}

@Immutable
data class DrawerItemsData(
    val drawerItemIcon: ImageVector?,
    val drawerItemLabel: String
)