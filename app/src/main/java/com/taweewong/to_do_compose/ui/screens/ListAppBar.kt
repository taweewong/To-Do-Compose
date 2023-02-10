package com.taweewong.to_do_compose.ui.screens

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.taweewong.to_do_compose.ui.theme.topAppBarBackgroundColor
import com.taweewong.to_do_compose.ui.theme.topAppBarContentColor

@Composable
fun ListAppBar() {
}

@Composable
fun DefaultListAppBar() {
    TopAppBar(
        title = {
            Text(text = "Tasks", color = MaterialTheme.colors.topAppBarContentColor)
        },
        backgroundColor = MaterialTheme.colors.topAppBarBackgroundColor
    )
}

@Composable
@Preview
fun DefaultListAppBarPreview() {
    DefaultListAppBar()
}