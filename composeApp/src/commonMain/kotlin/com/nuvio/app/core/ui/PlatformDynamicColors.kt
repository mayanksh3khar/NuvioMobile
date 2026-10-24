package com.nuvio.app.core.ui

import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable

/** Material You (wallpaper-derived) dark color scheme, or null when the platform has none. */
@Composable
expect fun platformDynamicColorScheme(): ColorScheme?
