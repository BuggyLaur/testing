package com.stu70999.testing

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            myLogin()
        }
    }
}


@Composable
fun topPart(){
    Spacer(modifier = Modifier.height(5.dp))

    Text(text = "", fontSize = 30.sp, color= Color.White)
    Text(text = "M", fontSize = 50.sp, color= Color.White)
    Text(text = "Mobile Server Name",
        fontSize = 30.sp,
        color = Color.White,
        fontWeight = FontWeight.Bold
    )
    Text(
        text = "Please provide your server credentials",
        fontSize = 20.sp,
        color = Color.White
        )
}

@Composable
fun bottomPart() {
    Spacer(modifier = Modifier.height(5.dp))
    Text(text = "Footer goes here",
        fontSize = 20.sp,
        color = Color.White
        )
}

@Composable
fun buttonsPart() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            )
    {
                Button(
                    Modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                        .weight(1f),
                    onClick ={ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = Color.Red,
                    ),
                )

}


@Composable
fun myLogin() {

    Surface(
        color = Color.Red,

        ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
        ) {
            topPart()
            buttonsPart()
            bottomPart()


        }
    }

}}
