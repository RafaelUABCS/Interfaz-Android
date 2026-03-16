package com.example.interfaz.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController

@Composable
fun PantallaInicioSesion(navController: NavController) {

    var email    by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    val isEmailValid = email.isNotEmpty() &&
            email.count { it == '@' } == 1 &&
            email.indexOf('@') > 0 &&
            email.contains('.') &&
            email.lastIndexOf('.') > email.indexOf('@') + 1 &&
            !email.endsWith('.')

    val isFormValid = isEmailValid && password.isNotEmpty()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF5C4DB1))
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White, shape = RoundedCornerShape(40.dp))
                .padding(horizontal = 30.dp, vertical = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Welcome Back",
                fontSize = 28.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color(0xFF333333)
            )

            Spacer(modifier = Modifier.height(32.dp))

            // ── Email ────────────────────────────────────────────────────
            Text(
                text = "Email",
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF333333),
                modifier = Modifier.fillMaxWidth().padding(bottom = 6.dp)
            )
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                placeholder = {
                    Text(text = "example@email.com", color = Color(0xFFAAAAAA), fontSize = 14.sp)
                },
                isError = email.isNotEmpty() && !isEmailValid,
                supportingText = {
                    if (email.isNotEmpty() && !isEmailValid)
                        Text(text = "Enter a valid email (e.g. user@mail.com)",
                            color = Color(0xFFB00020), fontSize = 11.sp)
                },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(14.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                singleLine = true,
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor    = Color(0xFFDDDDDD),
                    focusedBorderColor      = Color(0xFF5C4DB1),
                    errorBorderColor        = Color(0xFFB00020),
                    unfocusedContainerColor = Color(0xFFF7F7F7),
                    focusedContainerColor   = Color(0xFFF7F7F7)
                )
            )

            Spacer(modifier = Modifier.height(18.dp))

            // ── Password (sin validación) ─────────────────────────────────
            Text(
                text = "Password",
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF333333),
                modifier = Modifier.fillMaxWidth().padding(bottom = 6.dp)
            )
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                placeholder = {
                    Text(text = "••••••••", color = Color(0xFFAAAAAA), fontSize = 18.sp)
                },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(14.dp),
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                singleLine = true,
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor    = Color(0xFFDDDDDD),
                    focusedBorderColor      = Color(0xFF5C4DB1),
                    unfocusedContainerColor = Color(0xFFF7F7F7),
                    focusedContainerColor   = Color(0xFFF7F7F7)
                )
            )

            Box(
                modifier = Modifier.fillMaxWidth().padding(top = 10.dp),
                contentAlignment = Alignment.CenterEnd
            ) {
                Text(
                    text = "Forgot Password?",
                    fontSize = 13.sp,
                    color = Color(0xFF5C4DB1),
                    fontWeight = FontWeight.SemiBold
                )
            }

            Spacer(modifier = Modifier.height(30.dp))

            // ── Login Button ─────────────────────────────────────────────
            Button(
                onClick = { /* login logic */ },
                enabled = isFormValid,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp),
                shape = RoundedCornerShape(30.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF5C4DB1),
                    disabledContainerColor = Color(0xFFBBB3E0)
                )
            ) {
                Text(
                    text = "Login",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Don't have an account? ", fontSize = 13.sp, color = Color.Gray)
                Text(
                    text = "Sign Up",
                    fontSize = 13.sp,
                    color = Color(0xFF5C4DB1),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.clickable { navController.navigate("registro") }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLoginScreen() {
    PantallaInicioSesion(navController = rememberNavController())
}