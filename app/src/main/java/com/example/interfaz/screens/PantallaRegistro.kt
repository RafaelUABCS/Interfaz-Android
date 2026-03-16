package com.example.interfaz.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController

@Composable
fun PantallaRegistro(navController: NavController) {

    var fullName         by remember { mutableStateOf("") }
    var email            by remember { mutableStateOf("") }
    var phone            by remember { mutableStateOf("") }
    var password         by remember { mutableStateOf("") }
    var confirmPassword  by remember { mutableStateOf("") }

    val isFullNameValid  = fullName.isNotEmpty() && fullName.all { it.isLetter() || it == ' ' }
    val isEmailValid     = email.isNotEmpty() &&
            email.count { it == '@' } == 1 &&
            email.indexOf('@') > 0 &&
            email.contains('.') &&
            email.lastIndexOf('.') > email.indexOf('@') + 1 &&
            !email.endsWith('.')
    val isPhoneValid     = phone.length == 10 && phone.all { it.isDigit() }
    val isPasswordValid  = password.length >= 6
    val passwordsMatch   = confirmPassword.isNotEmpty() && password == confirmPassword

    val isFormValid = isFullNameValid && isEmailValid &&
            isPhoneValid && isPasswordValid && passwordsMatch

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
                .padding(horizontal = 30.dp, vertical = 40.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Create Account",
                fontSize = 28.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color(0xFF333333)
            )

            Spacer(modifier = Modifier.height(28.dp))

            Text(
                text = "Full Name",
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF333333),
                modifier = Modifier.fillMaxWidth().padding(bottom = 6.dp)
            )
            OutlinedTextField(
                value = fullName,
                onValueChange = { fullName = it },
                placeholder = {
                    Text(text = "Donald Trump", color = Color(0xFFAAAAAA), fontSize = 14.sp)
                },
                isError = fullName.isNotEmpty() && !isFullNameValid,
                supportingText = {
                    if (fullName.isNotEmpty() && !isFullNameValid)
                        Text(text = "Only letters and spaces are allowed",
                            color = Color(0xFFB00020), fontSize = 11.sp)
                },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(14.dp),
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor    = Color(0xFFDDDDDD),
                    focusedBorderColor      = Color(0xFF5C4DB1),
                    errorBorderColor        = Color(0xFFB00020),
                    unfocusedContainerColor = Color(0xFFF7F7F7),
                    focusedContainerColor   = Color(0xFFF7F7F7)
                )
            )

            Spacer(modifier = Modifier.height(12.dp))

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

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Phone Number",
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF333333),
                modifier = Modifier.fillMaxWidth().padding(bottom = 6.dp)
            )
            OutlinedTextField(
                value = phone,
                onValueChange = { input ->
                    if (input.all { it.isDigit() } && input.length <= 10) phone = input
                },
                placeholder = {
                    Text(text = "10-digit number", color = Color(0xFFAAAAAA), fontSize = 14.sp)
                },
                isError = phone.isNotEmpty() && !isPhoneValid,
                supportingText = {
                    if (phone.isNotEmpty() && !isPhoneValid)
                        Text(text = "Must be exactly 10 digits",
                            color = Color(0xFFB00020), fontSize = 11.sp)
                },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(14.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                singleLine = true,
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor    = Color(0xFFDDDDDD),
                    focusedBorderColor      = Color(0xFF5C4DB1),
                    errorBorderColor        = Color(0xFFB00020),
                    unfocusedContainerColor = Color(0xFFF7F7F7),
                    focusedContainerColor   = Color(0xFFF7F7F7)
                )
            )

            Spacer(modifier = Modifier.height(12.dp))

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
                    Text(text = "Min. 6 characters", color = Color(0xFFAAAAAA), fontSize = 14.sp)
                },
                isError = password.isNotEmpty() && !isPasswordValid,
                supportingText = {
                    if (password.isNotEmpty() && !isPasswordValid)
                        Text(text = "Password must be at least 6 characters",
                            color = Color(0xFFB00020), fontSize = 11.sp)
                },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(14.dp),
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                singleLine = true,
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor    = Color(0xFFDDDDDD),
                    focusedBorderColor      = Color(0xFF5C4DB1),
                    errorBorderColor        = Color(0xFFB00020),
                    unfocusedContainerColor = Color(0xFFF7F7F7),
                    focusedContainerColor   = Color(0xFFF7F7F7)
                )
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Confirm Password",
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF333333),
                modifier = Modifier.fillMaxWidth().padding(bottom = 6.dp)
            )
            OutlinedTextField(
                value = confirmPassword,
                onValueChange = { confirmPassword = it },
                placeholder = {
                    Text(text = "Repeat your password", color = Color(0xFFAAAAAA), fontSize = 14.sp)
                },
                isError = confirmPassword.isNotEmpty() && !passwordsMatch,
                supportingText = {
                    if (confirmPassword.isNotEmpty() && !passwordsMatch)
                        Text(text = "Passwords do not match",
                            color = Color(0xFFB00020), fontSize = 11.sp)
                },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(14.dp),
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                singleLine = true,
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor    = Color(0xFFDDDDDD),
                    focusedBorderColor      = Color(0xFF5C4DB1),
                    errorBorderColor        = Color(0xFFB00020),
                    unfocusedContainerColor = Color(0xFFF7F7F7),
                    focusedContainerColor   = Color(0xFFF7F7F7)
                )
            )

            Spacer(modifier = Modifier.height(28.dp))

            Button(
                onClick = {},
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
                    text = "Sign Up",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Already have an account? ", fontSize = 13.sp, color = Color.Gray)
                Text(
                    text = "Login",
                    fontSize = 13.sp,
                    color = Color(0xFF5C4DB1),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.clickable { navController.navigate("inicio_sesion") }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRegisterScreen() {
    PantallaRegistro(navController = rememberNavController())
}