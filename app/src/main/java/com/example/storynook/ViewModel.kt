package com.example.storynook

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route: String) {
    object MyReadingNook : Screen("my_reading_nook")
    object MyReadingPiles : Screen("my_reading_piles")
    object Wander : Screen("wander")
    object ReadingCircles : Screen("reading_circles")
    object MyCorner : Screen("my_corner")
}

data class NavItem(
    val label: String,
    val icon: ImageVector,
    val route: String
)

val navItems = listOf(
    NavItem(
        label = "Nook",
        icon = Icons.Filled.Home,
        route = Screen.MyReadingNook.route
    ),
    NavItem(
        label = "Piles",
        icon = Icons.AutoMirrored.Filled.List,
        route = Screen.MyReadingPiles.route
    ),
    NavItem(
        label = "Wander",
        icon = Icons.Filled.Search,
        route = Screen.Wander.route
    ),
    NavItem(
        label = "Circles",
        icon = Icons.Filled.Person,
        route = Screen.ReadingCircles.route
    ),
    NavItem(
        label = "Corner",
        icon = Icons.Filled.AccountCircle,
        route = Screen.MyCorner.route
    )
)
