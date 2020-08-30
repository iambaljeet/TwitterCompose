package com.app.twittercompose.state

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.mutableStateListOf

class HomeUiState(
    allTweets: List<Tweets>
) {
    private val _tweets: MutableList<Tweets> =
        mutableStateListOf(*allTweets.toTypedArray())
    val tweets: List<Tweets> = _tweets
}

@Immutable
data class Tweets(
    val tweetId: Long, val userName: String,
    val userAccountHandle: String, @DrawableRes val userProfilePic: Int,
    val timeStamp: String, val content: String?,
    @DrawableRes val image: Int?, val likeCount: Long,
    val retweetCount: Long, val commentCount: Long
)