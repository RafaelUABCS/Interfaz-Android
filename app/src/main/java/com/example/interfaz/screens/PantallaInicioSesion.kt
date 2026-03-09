package com.example.interfaz.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PantallaInicioSesion() {
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

            Text(
                text = "Email",
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF333333),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 6.dp)
            )
            OutlinedTextField(
                value = "",
                onValueChange = { },
                placeholder = {
                    Text(text = "example@email.com", color = Color(0xFFAAAAAA), fontSize = 14.sp)
                },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(14.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                singleLine = true,
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xFFDDDDDD),
                    focusedBorderColor = Color(0xFF5C4DB1),
                    unfocusedContainerColor = Color(0xFFF7F7F7),
                    focusedContainerColor = Color(0xFFF7F7F7)
                )
            )

            Spacer(modifier = Modifier.height(18.dp))

            Text(
                text = "Password",
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF333333),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 6.dp)
            )
            OutlinedTextField(
                value = "",
                onValueChange = { },
                placeholder = {
                    Text(text = "••••••••", color = Color(0xFFAAAAAA), fontSize = 18.sp)
                },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(14.dp),
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                singleLine = true,
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xFFDDDDDD),
                    focusedBorderColor = Color(0xFF5C4DB1),
                    unfocusedContainerColor = Color(0xFFF7F7F7),
                    focusedContainerColor = Color(0xFFF7F7F7)
                )
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
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

            Button(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp),
                shape = RoundedCornerShape(30.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF5C4DB1)
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
                Text(
                    text = "Don't have an account? ",
                    fontSize = 13.sp,
                    color = Color.Gray
                )
                Text(
                    text = "Sign Up",
                    fontSize = 13.sp,
                    color = Color(0xFF5C4DB1),
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = false)
@Composable
fun PreviewInicioSesion() {
    PantallaInicioSesion()
}
