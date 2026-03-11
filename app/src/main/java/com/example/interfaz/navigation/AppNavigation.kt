package com.example.interfaz

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.interfaz.screens.PantallaLogin
import com.example.interfaz.screens.PantallaInicioSesion
import com.example.interfaz.screens.PantallaRegistro

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            PantallaLogin(navController)
        }
        composable("inicio_sesion") {
            PantallaInicioSesion(navController)
        }
        composable("registro") {
            PantallaRegistro(navController)
        }
    }
}