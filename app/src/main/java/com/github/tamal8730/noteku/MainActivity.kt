package com.github.tamal8730.noteku

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.github.tamal8730.noteku.core.navigation.SetupNavGraph
import com.github.tamal8730.noteku.ui.theme.NoteItTheme

class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NoteItTheme {
                navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}