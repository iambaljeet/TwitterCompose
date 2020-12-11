package com.app.twittercompose.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.app.twittercompose.state.HomeUiState

@Composable
fun TweetsList(
    uiState: HomeUiState
) {
    LazyColumnFor(
        contentPadding = PaddingValues(
            top = 10.dp
        ),
        items = uiState.tweets) { tweets ->
        TweetComponent(tweets = tweets)
    }
}