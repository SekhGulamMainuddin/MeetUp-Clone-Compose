package com.sekhgmainuddin.meetupapp

import MeetupCloneTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MeetupCloneTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "") {
                    composable("profile") {

                    }
                }
            }
        }
    }
}