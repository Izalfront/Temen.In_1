package com.example.temenin_1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.temenin_1.ui.theme.Female
import com.example.temenin_1.ui.theme.Level
import com.example.temenin_1.ui.theme.Online

@Preview(showBackground = true)
@Composable
fun SectionUlasan(){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        UlasanPenjual()
    }
}

@Composable
fun UlasanPenjual(){

    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.04f),
        ),
        modifier = Modifier
            .clickable { }
            .wrapContentWidth()
    ){
        Row() {
            Image( modifier = Modifier
                .size(120.dp)
                .fillMaxSize(),
                painter = painterResource(id = 0),
                contentDescription = "as"
            )
//              nama dan status penjual
            Column{
                Row (modifier = Modifier
                    .padding(horizontal = 10.dp, vertical = 10.dp)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween){
                    Text(
                        text = "nama",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp
                        )
                    )
                    Text(text = "Online",
                        color = Online,
                        style = TextStyle(
                            fontWeight = FontWeight.Normal,
                            fontSize = 12.sp
                        )
                    )
                }

//                Konten LEVEL dan RATING
                Row (modifier = Modifier.padding(bottom = 12.dp)){
//                        LEVEL Penjual
                    Text(modifier = Modifier
                        .padding(horizontal = 10.dp, vertical = 6.dp)
                        .background(Level, shape = RoundedCornerShape(4.dp))
                        .padding(8.dp),
                        text = "Level ",
                        color = Color.White,
                        style = TextStyle(fontWeight = FontWeight.SemiBold, fontSize = 10.sp)
                    )
//                        RATING Penjual
                    Text(modifier = Modifier
                        .padding(vertical = 6.dp)
                        .background(Color.White, shape = RoundedCornerShape(4.dp))
                        .padding(8.dp),
                        text = "Rate",
                        color = Female,
                        style = TextStyle(fontWeight = FontWeight.SemiBold, fontSize = 10.sp)
                    )
                }
            }
        }
    }
    Spacer(modifier = Modifier.padding(top = 12.dp))
}
