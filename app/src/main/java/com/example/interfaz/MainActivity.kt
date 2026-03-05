package com.example.interfaz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PantallaLogin()
        }
    }
}
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

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp)
                    .background(Color(0xFF5C4DB1), shape = RoundedCornerShape(30.dp)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Login",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp)
                    .border(
                        width = 1.dp,
                        color = Color(0xFF5C4DB1),
                        shape = RoundedCornerShape(30.dp)
                    ),
                contentAlignment = Alignment.Center
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
               // SocialCircle("f", Color(0xFF3b5998))

           Box(
               modifier = Modifier
                   .size(45.dp)
                   .background(Color(0xFF3b5998), shape = CircleShape),
               contentAlignment = Alignment.Center
           ) {
               Text(
                   text = "f",
                   color = Color.White,
                   fontWeight = FontWeight.Bold
               )
           }

           Box(
               modifier = Modifier
                   .size(45.dp)
                   .background(Color(0xFFDB4437), shape = CircleShape),
               contentAlignment = Alignment.Center
           ) {
               Text(
                   text = "G+",
                   color = Color.White,
                   fontWeight = FontWeight.Bold
               )
           }

           Box(
               modifier = Modifier
                   .size(45.dp)
                   .background(Color(0xFF0077B5), shape = CircleShape),
               contentAlignment = Alignment.Center
           ) {
               Text(
                   text = "in",
                   color = Color.White,
                   fontWeight = FontWeight.Bold
               )
           }

            }
        }
    }
}

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
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp)
                    .border(1.dp, Color(0xFFDDDDDD), shape = RoundedCornerShape(14.dp))
                    .background(Color(0xFFF7F7F7), shape = RoundedCornerShape(14.dp))
                    .padding(horizontal = 16.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Text(
                    text = "example@email.com",
                    fontSize = 14.sp,
                    color = Color(0xFFAAAAAA)
                )
            }

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
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp)
                    .border(1.dp, Color(0xFFDDDDDD), shape = RoundedCornerShape(14.dp))
                    .background(Color(0xFFF7F7F7), shape = RoundedCornerShape(14.dp))
                    .padding(horizontal = 16.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Text(
                    text = "••••••••",
                    fontSize = 18.sp,
                    color = Color(0xFFAAAAAA)
                )
            }

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

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp)
                    .background(Color(0xFF5C4DB1), shape = RoundedCornerShape(30.dp)),
                contentAlignment = Alignment.Center
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

@Composable
fun PantallaRegistro() {
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
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 6.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp)
                    .border(1.dp, Color(0xFFDDDDDD), shape = RoundedCornerShape(14.dp))
                    .background(Color(0xFFF7F7F7), shape = RoundedCornerShape(14.dp))
                    .padding(horizontal = 16.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Text(
                    text = "Donald Trump",
                    fontSize = 14.sp,
                    color = Color(0xFFAAAAAA)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Email",
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF333333),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 6.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp)
                    .border(1.dp, Color(0xFFDDDDDD), shape = RoundedCornerShape(14.dp))
                    .background(Color(0xFFF7F7F7), shape = RoundedCornerShape(14.dp))
                    .padding(horizontal = 16.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Text(
                    text = "example@email.com",
                    fontSize = 14.sp,
                    color = Color(0xFFAAAAAA)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Password",
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF333333),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 6.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp)
                    .border(1.dp, Color(0xFFDDDDDD), shape = RoundedCornerShape(14.dp))
                    .background(Color(0xFFF7F7F7), shape = RoundedCornerShape(14.dp))
                    .padding(horizontal = 16.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Text(
                    text = "••••••••",
                    fontSize = 18.sp,
                    color = Color(0xFFAAAAAA)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Confirm Password",
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF333333),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 6.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp)
                    .border(1.dp, Color(0xFFDDDDDD), shape = RoundedCornerShape(14.dp))
                    .background(Color(0xFFF7F7F7), shape = RoundedCornerShape(14.dp))
                    .padding(horizontal = 16.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Text(
                    text = "••••••••",
                    fontSize = 18.sp,
                    color = Color(0xFFAAAAAA)
                )
            }

            Spacer(modifier = Modifier.height(28.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp)
                    .background(Color(0xFF5C4DB1), shape = RoundedCornerShape(30.dp)),
                contentAlignment = Alignment.Center
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
                Text(
                    text = "Already have an account? ",
                    fontSize = 13.sp,
                    color = Color.Gray
                )
                Text(
                    text = "Login",
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
fun PreviewPantallaPrincipal() {
    PantallaLogin()
}

@Preview(showBackground = true, showSystemUi = false)
@Composable
fun PreviewInicioSesion() {
    PantallaInicioSesion()
}

@Preview(showBackground = true, showSystemUi = false)
@Composable
fun PreviewRegistro() {
    PantallaRegistro()
}