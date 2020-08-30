package com.app.twittercompose.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.app.twittercompose.R

private val DarkColorPalette = darkColors(
        primary = purple200,
        primaryVariant = purple700,
        secondary = twitter_color
)

private val LightColorPalette = lightColors(
        primary = purple500,
        primaryVariant = purple700,
        secondary = twitter_color
)

private val lightIconColor = white_color
private val darkIconColor = black_color

@Composable
fun getIconColor(): Color {
    return if (isSystemInDarkTheme()) {
        lightIconColor
    } else {
        darkIconColor
    }
}

@Composable
fun TwitterComposeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = typography,
        shapes = shapes,
        content = content
    )
}