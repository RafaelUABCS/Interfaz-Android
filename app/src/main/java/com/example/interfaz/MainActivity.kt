package com.example.interfaz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.interfaz.screens.PantallaLogin
import com.example.interfaz.screens.PantallaInicioSesion
import com.example.interfaz.screens.PantallaRegistro


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PantallaLogin()
        }
    }
}