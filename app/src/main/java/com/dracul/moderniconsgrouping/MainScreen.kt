package com.dracul.moderniconsgrouping

import android.os.Build
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.dracul.triplex.icons.TriplexIcons
import com.dracul.triplex.icons.ic_align_left_24_v1.IcAlignLeft_24V1
import com.dracul.triplex.icons.ic_align_left_24_v2.IcAlignLeft_24V2

@RequiresApi(Build.VERSION_CODES.R)
@Composable
fun MainScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            imageVector = TriplexIcons.IcAlignLeft_24V1, contentDescription = null
        )
        Image(
            imageVector = TriplexIcons.IcAlignLeft_24V2.current, contentDescription = null
        )
    }
}

@Composable
private fun ColumnScope.MyTextField(text: String, onTextChanged: (String) -> Unit) {
    var text1 = text
    OutlinedTextField(
        modifier = Modifier.weight(9f),
        value = text1,
        onValueChange = onTextChanged,
        singleLine = true
    )
}

@Composable
private fun RowScope.MyTextField(text: String, onTextChanged: (String) -> Unit) {
    var text1 = text
    OutlinedTextField(
        modifier = Modifier.weight(9f),
        value = text1,
        onValueChange = onTextChanged,
        singleLine = true
    )
}

