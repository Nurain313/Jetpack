package com.example.rolerdise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rolerdise.ui.theme.RolerDiseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RolerDiseTheme {
                // A surface container using the 'background' color from the theme
                RolerDise ()
            }
        }
    }
}






@Preview
@Composable
fun RolerDise (){
    RolerWithButton(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    )
}






@Composable
fun RolerWithButton(modifier: Modifier=Modifier){
Column(
    modifier = modifier,
    horizontalAlignment = Alignment.CenterHorizontally
) {
    Button(onClick = { /*TODO*/ }) {
        Text(text = "Click me to roll")
    }
    Spacer(modifier = Modifier.height(20.dp))
    Image(painter = painterResource(id = R.drawable.dice_6), contentDescription = null)
}
}