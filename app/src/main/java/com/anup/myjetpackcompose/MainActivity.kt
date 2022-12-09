package com.anup.myjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.anup.myjetpackcompose.ui.theme.MyJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val scaffoldState = rememberScaffoldState()
            var textFiledState by remember {
                mutableStateOf("")
            }

           Scaffold(modifier = Modifier.fillMaxSize(),
               scaffoldState = scaffoldState) {
               Column(
                   horizontalAlignment = Alignment.CenterHorizontally,
                   modifier = Modifier
                       .fillMaxSize()
                       .padding(horizontal = 30.dp)
               ) {
                   TextField(value = textFiledState , label = {
                       Text(text = "Enter your name")
                   }, onValueChange = {
                       textFiledState=it
                   }, singleLine = true,
                       modifier = Modifier.fillMaxWidth()

                   )
               }
           }
        }
    }
}

