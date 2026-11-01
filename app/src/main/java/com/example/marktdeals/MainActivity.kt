package com.example.marktdeals

import android.os.Bundle
import android.Manifest
import android.content.pm.PackageManager
import android.os.Build
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.marktdeals.ui.components.TopBar
import com.example.marktdeals.ui.screens.CategoryScreen
import com.example.marktdeals.ui.screens.DetailScreen
import com.example.marktdeals.ui.screens.HomeScreen
import com.example.marktdeals.ui.screens.ResultsScreen
import com.example.marktdeals.ui.screens.SearchScreen
import com.example.marktdeals.ui.components.Green

enum class Screen {
    HOME,
    SEARCH,
    RESULTS,
    CATEGORY,
    DETAIL
}

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        NotificationHelper.createNotificationChannel(this)

        AlarmScheduler.scheduleNotification(this)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (
                ContextCompat.checkSelfPermission(
                    this,
                    Manifest.permission.POST_NOTIFICATIONS
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this,
                    arrayOf(Manifest.permission.POST_NOTIFICATIONS),
                    100
                )
            }
        }

        setContent {
            MarktDealsApp()
        }
    }
}

@Composable
fun MarktDealsApp() {

    var screen by remember { mutableStateOf(Screen.HOME) }
    var query by remember { mutableStateOf("") }
    var selected by remember { mutableStateOf(products[9]) }

    var detailOrigin by remember {
        mutableStateOf(Screen.HOME)
    }

    var selectedCategory by remember {
        mutableStateOf("")
    }

    MaterialTheme(
        colorScheme = lightColorScheme(
            primary = Green,
            onPrimary = Color.White,
            surface = Color.White,
            background = Color(0xFF202020)
        )
    ) {

        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFF202020)
        ) {

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 18.dp),
                contentAlignment = Alignment.TopCenter
            ) {

                Surface(
                    modifier = Modifier
                        .widthIn(max = 430.dp)
                        .fillMaxHeight(),
                    color = Color.White,
                    shadowElevation = 3.dp
                ) {

                    Column {

                        TopBar(
                            showBack = screen != Screen.HOME,

                            onBack = {
                                screen = when (screen) {
                                    Screen.DETAIL -> detailOrigin
                                    Screen.CATEGORY -> Screen.HOME
                                    Screen.RESULTS -> Screen.SEARCH
                                    Screen.SEARCH -> Screen.HOME
                                    Screen.HOME -> Screen.HOME
                                }
                            },

                            onHome = {
                                screen = Screen.HOME
                            }
                        )

                        when (screen) {

                            Screen.HOME -> HomeScreen(
                                onSearch = {
                                    query = it
                                    screen =
                                        if (it.isBlank()) {
                                            Screen.SEARCH
                                        } else {
                                            Screen.RESULTS
                                        }
                                },

                                onProduct = {
                                    selected = it
                                    detailOrigin = Screen.HOME
                                    screen = Screen.DETAIL
                                },

                                onCategory = {
                                    selectedCategory = it
                                    screen = Screen.CATEGORY
                                }
                            )

                            Screen.SEARCH -> SearchScreen(
                                query = query,

                                onQuery = {
                                    query = it
                                },

                                onSearch = { searchQuery ->
                                    query = searchQuery

                                    screen =
                                        if (searchQuery.isBlank()) {
                                            Screen.SEARCH
                                        } else {
                                            Screen.RESULTS
                                        }
                                }
                            )

                            Screen.RESULTS -> ResultsScreen(
                                query = query,

                                onQueryChange = {
                                    query = it
                                },

                                onSearch = { searchQuery ->
                                    query = searchQuery

                                    screen =
                                        if (searchQuery.isBlank()) {
                                            Screen.SEARCH
                                        } else {
                                            Screen.RESULTS
                                        }
                                },

                                onProduct = {
                                    selected = it
                                    detailOrigin = Screen.RESULTS
                                    screen = Screen.DETAIL
                                }
                            )

                            Screen.CATEGORY -> CategoryScreen(
                                category = selectedCategory,
                                onProduct = { product ->
                                    selected = product
                                    detailOrigin = Screen.CATEGORY
                                    screen = Screen.DETAIL
                                }
                            )

                            Screen.DETAIL -> DetailScreen(
                                product = selected,
                                onBack = {
                                    screen = detailOrigin
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}