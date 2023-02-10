package com.taweewong.to_do_compose.navigation

import androidx.navigation.NavHostController
import com.taweewong.to_do_compose.util.Action
import com.taweewong.to_do_compose.util.Constants.LIST_SCREEN
import com.taweewong.to_do_compose.util.Constants.TASK_SCREEN

class Screens(navHostController: NavHostController) {
    val list: (Action) -> Unit = { action ->
        navHostController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navHostController.navigate("task/$taskId") {
            popUpTo(TASK_SCREEN) { inclusive = true }
        }
    }
}