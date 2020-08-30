package com.app.twittercompose.state

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf

class ProfileUiState(
    myProfile: Profile,
) {
    private val _myProfiles: MutableState<Profile> =
        mutableStateOf(myProfile)
    val myProfile: Profile = _myProfiles.value
}

@Immutable
data class Profile(
    val userId: Int, val userName: String,
    val userAccountHandle: String, @DrawableRes val userProfilePic: Int,
    val userProfileDescription: String, val userFollowersCount: Int,
    val userFollowingCount: Int, val userLocation: String,
    val userJoinedTimeStamp: String, val userWebsite: String
)