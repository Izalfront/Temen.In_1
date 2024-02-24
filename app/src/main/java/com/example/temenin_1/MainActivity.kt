package com.example.temenin_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.temenin_1.data.TemeninData
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
                        Column (
                            modifier = Modifier
                                .padding(horizontal = 12.dp)
                                .fillMaxWidth(),
                            horizontalAlignment = Alignment.Start
                        ){
                            Text(text = "Jasa Temenin Terpopuler",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = MaterialTheme.colorScheme.onBackground
                            )
                            Spacer(modifier = Modifier.padding(top = 12.dp))
                            LazyColumn() {
                                items(TemeninData.temenin.size) { index ->
                                    CardJasaTemenin(index)
                                }
                            }

                        }
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
                Column (
                    modifier = Modifier
                        .padding(horizontal = 12.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.Start
                ){
                    Text(text = "Jasa Temenin Terpopuler",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = MaterialTheme.colorScheme.onBackground
                    )
                    Spacer(modifier = Modifier.padding(top = 12.dp))
                    LazyColumn() {
                        items(TemeninData.temenin.size) { index ->
                            CardJasaTemenin(index)
                        }
                    }

                }
            }
        }
    }
}