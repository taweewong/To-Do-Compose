package com.taweewong.to_do_compose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.taweewong.to_do_compose.navigation.destination.listComposable
import com.taweewong.to_do_compose.navigation.destination.taskComposable
import com.taweewong.to_do_compose.util.Constants.LIST_SCREEN

@Composable
fun SetupNavigation(
    navHostController: NavHostController
) {
    val screen = remember(navHostController) {
        Screens(navHostController = navHostController)
    }

    NavHost(
        navController = navHostController,
        startDestination = LIST_SCREEN
    ) {
        listComposable(
            navigateToTaskScreen = screen.task
        )
        taskComposable(
            navigateToListScreen = screen.list
        )
    }
}
