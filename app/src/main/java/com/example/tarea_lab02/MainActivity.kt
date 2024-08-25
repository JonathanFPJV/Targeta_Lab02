package com.example.tarea_lab02

import android.R.style
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background )
            {
                GreetingCard()

            }
        }
    }

}

@Composable
fun GreetingCard() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFD0E8D7))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center )
    {
        Spacer(modifier = Modifier.height(140.dp))
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color(0xFF073042)), // Color de fondo azul
            contentAlignment = Alignment.Center
        ){
            Image( painter = painterResource(id = R.drawable.android_logo),
                contentDescription = "Course Image",
                modifier = Modifier.size(80.dp) )
        }

        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Jennifer Doe",
            fontSize = 50.sp,
            fontWeight = FontWeight.SemiBold)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Android Developer Extraordinaire",
            style = MaterialTheme.typography.bodyLarge,
            color = Color(0xFF3A5F41), // Verde oscuro
            fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(140.dp))

        Column(
            modifier = Modifier.padding(bottom = 48.dp),
            horizontalAlignment = Alignment.Start // Centramos todo horizontalmente
        ) {
            Box {
                // Teléfono
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {
                    Icon(
                        imageVector = Icons.Filled.Phone,
                        contentDescription = null,
                        tint = Color(0xFF3A5F41), // Verde oscuro
                        modifier = Modifier
                            .padding(end = 16.dp)
                            .size(24.dp)
                    )
                    Text(
                        text = "+11 (123) 444 555 666",
                        fontSize = 16.sp,
                        color = Color.Black
                    )
                }
            }
            
            Spacer(modifier = Modifier.height(8.dp))

            Box {
                // Compartir (Social media handle)
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {
                    Icon(
                        imageVector = Icons.Filled.Share,
                        contentDescription = null,
                        tint = Color(0xFF3A5F41), // Verde oscuro
                        modifier = Modifier
                            .padding(end = 16.dp)
                            .size(24.dp)
                    )
                    Text(
                        text = "@AndroidDev",
                        fontSize = 16.sp,
                        color = Color.Black
                    )
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Box {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = null,
                        tint = Color(0xFF3A5F41), // Verde oscuro
                        modifier = Modifier
                            .padding(end = 16.dp)
                            .size(24.dp)
                    )
                    Text(
                        text = "jen.doe@android.com",
                        fontSize = 16.sp,
                        color = Color.Black
                    )
                }
            }

        }

    }



}



@Preview(showBackground = true,
    showSystemUi =true,
    name = "My Preview")
@Composable
fun PreviewGreetingCard() {
    GreetingCard()

}


