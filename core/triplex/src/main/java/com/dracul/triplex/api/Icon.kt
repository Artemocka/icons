package com.dracul.triplex.api

import android.os.Build
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalConfiguration

data class Icon(
    val light: ImageVector, val dark: ImageVector
) {
    val current: ImageVector
        @Composable get() {
            return if (hasRequiredVersion() && LocalConfiguration.current.isNightModeActive) dark else light
        }

    @Composable
    fun current(): ImageVector =
        if (hasRequiredVersion() && LocalConfiguration.current.isNightModeActive) dark else light

}

private fun hasRequiredVersion(): Boolean = Build.VERSION.SDK_INT >= Build.VERSION_CODES.R