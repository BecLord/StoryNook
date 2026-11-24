package com.example.storynook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.storynook.ui.theme.StoryNookTheme
import com.example.storynook.data.BookRepository
import com.example.storynook.viewModel.BooksViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import kotlinx.serialization.Serializable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val bookRepository = BookRepository(context = this)
        val factory = viewModelFactory {
            initializer {
                BooksViewModel(bookRepository)
            }
        }
        setContent {
            val booksViewModel: BooksViewModel = viewModel(
                factory = factory
            )

            StoryNookTheme {
                var currentScreen by rememberSaveable { mutableStateOf("landing") }

                when (currentScreen) {
                    "landing" -> LandingScreen(
                        onNavigateToCreateAccount = { currentScreen = "register" },
                        onNavigateToLogin = { currentScreen = "login" }
                    )
                    "register" -> RegistrationScreen(
                        onNavigateToLogin = { currentScreen = "login" },
                        onNavigateToCreateAccount = { currentScreen = "register" },
                        onNavigateToMyReadingNook = { currentScreen = "main" }
                    )
                    "login" -> LoginScreen(
                        onNavigateToForgotPassword = { /* TODO: Forgot password */ },
                        onNavigateToCreateAccount = { currentScreen = "register" },
                        onNavigateToMyReadingNook = { currentScreen = "main" }
                    )
                    "main" -> MainAppScreen()
                }
            }
        }
    }
}

@Composable
fun MainAppScreen() {
    var selectedRoute by rememberSaveable { mutableStateOf(Screen.MyReadingNook.route) }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar {
                navItems.forEach { item ->
                    NavigationBarItem(
                        icon = { Icon(item.icon, contentDescription = item.label) },
                        label = { Text(item.label) },
                        selected = selectedRoute == item.route,
                        onClick = { selectedRoute = item.route }
                    )
                }
            }
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            when (selectedRoute) {
                Screen.MyReadingNook.route -> MyReadingNookScreen()
                Screen.MyReadingPiles.route -> ScreenContent("My Reading Piles")
                Screen.Wander.route -> ScreenContent("Wander")
                Screen.ReadingCircles.route -> ScreenContent("Reading Circles")
                Screen.MyCorner.route -> ScreenContent("My Corner")
            }
        }
    }
}

@Composable
fun ScreenContent(title: String) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.headlineMedium
        )
    }
}

