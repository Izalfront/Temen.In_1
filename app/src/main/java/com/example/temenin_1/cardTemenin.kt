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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
// Color import
import com.example.temenin_1.ui.theme.Pink40

//val temenin = listOf(
//    Temenin(
//        image = R.drawable.cewe,
//        name = "Ayu",
//        desc = "desksripsi penjual untuk menarik minat...",
//        level = 21,
//        rating = 4.5,
//        order = 32
//    )
//)

@Preview(showBackground = true)
@Composable
fun CardJasaTemenin(){

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
        Card(
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.background,
            ),
            modifier = Modifier
                .clickable { }
                .wrapContentWidth()
                .shadow(
                    elevation = 8.dp,
                    shape = RoundedCornerShape(4.dp)
                )
        ) {
            Row() {
                Image( modifier = Modifier
                    .size(80.dp)
                    .fillMaxSize(),
                    painter = painterResource(id = R.drawable.testing),
                    contentDescription = ""
                )
//              nama dan status penjual
                Column{
                    Row (modifier = Modifier
                        .padding(horizontal = 10.dp, vertical = 10.dp)
                        .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween){
                        Text(
                            text = "Cici",
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp
                            )
                        )
                        Text(text = "Online",
                            color = MaterialTheme.colorScheme.primary,
                            style = TextStyle(
                                fontWeight = FontWeight.Normal,
                                fontSize = 12.sp
                            )
                        )
                    }
//                deskripsi penjual
                Text(
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp),
                    text = "desksripsi penjual untuk menarik minat...",
                    color = MaterialTheme.colorScheme.secondary.copy(alpha = 0.8f),
                    style = TextStyle(fontWeight = FontWeight.Normal, fontSize = 12.sp)
                    )
//                konten LEVEL dan RATING
                    Row (){
//                        LEVEL penjual
                        Text(modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                            .background(Pink40,shape = RoundedCornerShape(4.dp))
                            .padding(6.dp),
                            text = "Level 24",
                            color = Color.White,
                            style = TextStyle(fontWeight = FontWeight.SemiBold, fontSize = 12.sp))
//                        RATING penjual
                        Text(modifier = Modifier.padding(vertical = 6.dp)
                            .background(MaterialTheme.colorScheme.primary,shape = RoundedCornerShape(4.dp))
                            .padding(6.dp),
                            text = "Rating 5.4 (50)",
                            color = Color.White,
                            style = TextStyle(fontWeight = FontWeight.SemiBold, fontSize = 12.sp))
                    }
                }
            }
        }
    }
}