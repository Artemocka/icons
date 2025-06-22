package com.dracul.moderniconsgrouping

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.dracul.triplex.icons.TriplexIcons
import com.dracul.triplex.icons.ic_align_left_24_v1.IcAlignLeft_24V1
import com.dracul.triplex.icons.ic_align_left_24_v2.IcAlignLeft_24V2

@Composable
fun MainScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            imageVector = TriplexIcons.IcAlignLeft_24V1, contentDescription = null
        )
        Image(
            imageVector = TriplexIcons.IcAlignLeft_24V2.current, contentDescription = null
        )
        Image(
            imageVector = TriplexIcons.IcAlignLeft_24V2.current(), contentDescription = null
        )
    }
}
