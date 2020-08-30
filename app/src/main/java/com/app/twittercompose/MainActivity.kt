package com.app.twittercompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Icon
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import com.app.twittercompose.components.TweetsList
import com.app.twittercompose.data.drawerUiState
import com.app.twittercompose.data.homeUiState
import com.app.twittercompose.components.NavDrawer
import com.app.twittercompose.components.TopAppBar
import com.app.twittercompose.ui.TwitterComposeTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TwitterComposeTheme {
                Surface(color = MaterialTheme.colors.background) {
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun HomeScreen() {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                icon = {
                    Icon(asset = Icons.Default.Edit)
                },
                backgroundColor = MaterialTheme.colors.secondary
            )
        },
        topBar = {
            TopAppBar()
        },
        drawerContent = {
            NavDrawer(
                uiState = drawerUiState,
                openMyProfile = {}
            )
        },
        bodyContent = {
            TweetsList(
                uiState = homeUiState
            )
        },
    )
}