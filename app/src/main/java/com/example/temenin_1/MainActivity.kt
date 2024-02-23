package com.example.temenin_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.temenin_1.ui.theme.TemenIn_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TemenIn_1Theme {
                Scaffold (
                    bottomBar = { BottomNavigationBar() }
                ){
                        padding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(padding)
                    ){
                        Search()
                        Gender()
                        Spacer(modifier = Modifier.padding(top = 60.dp))
                        CardJasaTemenin()
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TemeninPreview() {
    TemenIn_1Theme {
        Scaffold (
            bottomBar = { BottomNavigationBar() }
        ){
            padding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
            ){
                Search()
                Gender()
                Spacer(modifier = Modifier.padding(top = 60.dp))
                CardJasaTemenin()
            }
        }
    }
}