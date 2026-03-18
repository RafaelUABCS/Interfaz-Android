package com.example.interfaz.screens


import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.interfaz.contact.Contact

@Composable
fun MainScreen(navController: NavController) {

    val contacts = listOf(
        Pair(first = "Juan Pérez", second = "612-123-4567"),
        Pair(first = "Ana López", second = "612-456-7890")
    )

    LazyColumn {
        items(items = contacts) { contact ->
            Contact(name = contact.first, phone = contact.second)
        }
    }
}

@Preview
@Composable
fun MainScreenPreview() {
    val navController = rememberNavController()
    MainScreen(navController)
}