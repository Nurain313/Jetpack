package com.example.lap

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lap.ui.theme.LapTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LapTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}
@Composable
fun BusinessCard(){
    Surface(color = Color(0xFF073042)) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .border(1.dp, Color.White, RectangleShape)
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            Text(
                text = "Android",
                fontSize = 11.sp,
                color = Color(0XFF399212)
            )
            Text(
                text = "Nourein Omari",
                fontSize = 11.sp,
                color = Color(0XFF399213)
            )
            Text(
                text = "Best android Developer",
                fontSize = 11.sp,
                color = Color(0XFF399214)
            )
        }
        Row {
            Text("Phone no:",fontSize = 13.sp,color = Color.White)
            Spacer(modifier = Modifier.width(20.dp))
            Text(text = "+254711220439", color = Color.White)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCard()
}