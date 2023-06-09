package com.vickram.navigationdrawer

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeScreen(navController: NavHostController = rememberNavController()){
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "HOME",
            style = TextStyle(
                color = Color.Green,
                fontWeight = FontWeight.Bold,
                fontSize = 35.sp
            )
        )
    }
}
@Composable
fun Profile(navController: NavHostController = rememberNavController()){
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "PROFILE",
            style = TextStyle(
                color = Color.Green,
                fontWeight = FontWeight.Bold,
                fontSize = 35.sp
            )
        )
    }
}
@Composable
fun SettingsScreen(navController: NavHostController = rememberNavController()){
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "SETTINGS",
            style = TextStyle(
                color = Color.Green,
                fontWeight = FontWeight.Bold,
                fontSize = 35.sp
            )
        )
    }
}
@Composable
fun FavouriteScreen(navController: NavHostController = rememberNavController()){
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "FAVOURITE",
            style = TextStyle(
                color = Color.Green,
                fontWeight = FontWeight.Bold,
                fontSize = 35.sp
            )
        )
    }
}
@Composable
fun LogOutScreen(navController: NavHostController = rememberNavController()){
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "LOG OUT",
            style = TextStyle(
                color = Color.Green,
                fontWeight = FontWeight.Bold,
                fontSize = 35.sp
            )
        )
    }
}