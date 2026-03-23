package com.example.interfaz.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.interfaz.contact.Contact

@Composable
fun MainScreen(navController: NavController) {

    var contacts by remember {
        mutableStateOf(
            listOf(
                Pair("Rafael Sánchez", "612 123 4567"),
                Pair("Ana Sánchez", "612 456 7890")
            )
        )
    }

    var nameInput by remember { mutableStateOf("") }
    var phoneInput by remember { mutableStateOf("") }

    var showError by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF3F4F6))
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF4F6AF5))
                .padding(horizontal = 20.dp, vertical = 20.dp)
        ) {
            Column {
                Text(
                    text = "My Contacts",
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            shape = RoundedCornerShape(20.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(
                    text = "Add contact",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF1A1A2E)
                )

                OutlinedTextField(
                    value = nameInput,
                    onValueChange = {
                        nameInput = it
                        showError = false
                    },
                    label = { Text("Name") },
                    singleLine = true,
                    isError = showError && nameInput.isBlank(),
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFF4F6AF5),
                        focusedLabelColor = Color(0xFF4F6AF5)
                    )
                )

                OutlinedTextField(
                    value = phoneInput,
                    onValueChange = {
                        phoneInput = it
                        showError = false
                    },
                    label = { Text("Phone") },
                    singleLine = true,
                    isError = showError && phoneInput.isBlank(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFF4F6AF5),
                        focusedLabelColor = Color(0xFF4F6AF5)
                    )
                )

                if (showError) {
                    Text(
                        text = "Please fill in all fields.",
                        color = Color(0xFFE53935),
                        fontSize = 12.sp
                    )
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Button(
                        onClick = {
                            if (nameInput.isBlank() || phoneInput.isBlank()) {
                                showError = true
                            } else {
                                contacts = contacts + Pair(
                                    nameInput.trim(),
                                    phoneInput.trim()
                                )
                                nameInput = ""
                                phoneInput = ""
                                showError = false
                            }
                        },
                        modifier = Modifier.weight(1f),
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF4F6AF5)
                        )
                    ) {
                        Text("Add", fontWeight = FontWeight.SemiBold)
                    }

                    OutlinedButton(
                        onClick = {
                            nameInput = ""
                            phoneInput = ""
                            showError = false
                        },
                        modifier = Modifier.weight(1f),
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.outlinedButtonColors(
                            contentColor = Color(0xFF4F6AF5)
                        )
                    ) {
                        Text("Clear", fontWeight = FontWeight.SemiBold)
                    }
                }
            }
        }


            LazyColumn(
                contentPadding = PaddingValues(bottom = 16.dp)
            ) {
                items(items = contacts) { contact ->
                    Contact(name = contact.first, phone = contact.second)
                }
            }

    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    val navController = rememberNavController()
    MainScreen(navController)
}