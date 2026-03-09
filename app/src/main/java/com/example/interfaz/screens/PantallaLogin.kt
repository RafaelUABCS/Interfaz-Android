package com.example.interfaz.screens



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.interfaz.R

@Composable
fun PantallaLogin() {
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

            Image(
                painter = painterResource(id = R.drawable.illustration),
                contentDescription = "Ilustración",
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1.2f)
            )

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Hello",
                fontSize = 32.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color(0xFF333333)
            )

            Text(
                text = "Welcome To Little Drop, where you manage your daily tasks",
                fontSize = 15.sp,
                color = Color.Gray,
                modifier = Modifier.padding(top = 12.dp),
                textAlign = TextAlign.Center,
                lineHeight = 20.sp
            )

            Spacer(modifier = Modifier.height(40.dp))

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

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedButton(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp),
                shape = RoundedCornerShape(30.dp),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color(0xFF5C4DB1)
                ),
                border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFF5C4DB1))
            ) {
                Text(
                    text = "Sign Up",
                    color = Color(0xFF5C4DB1),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "Sign up using",
                fontSize = 13.sp,
                color = Color.Gray
            )

            Row(
                modifier = Modifier.padding(top = 16.dp, bottom = 10.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    onClick = { },
                    modifier = Modifier.size(45.dp),
                    shape = CircleShape,
                    contentPadding = PaddingValues(0.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF3b5998))
                ) {
                    Text(text = "f", color = Color.White, fontWeight = FontWeight.Bold)
                }

                Button(
                    onClick = { },
                    modifier = Modifier.size(45.dp),
                    shape = CircleShape,
                    contentPadding = PaddingValues(0.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFDB4437))
                ) {
                    Text(text = "G+", color = Color.White, fontWeight = FontWeight.Bold)
                }

                Button(
                    onClick = { },
                    modifier = Modifier.size(45.dp),
                    shape = CircleShape,
                    contentPadding = PaddingValues(0.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0077B5))
                ) {
                    Text(text = "in", color = Color.White, fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = false)
@Composable
fun PreviewPantallaPrincipal() {
    PantallaLogin()
}