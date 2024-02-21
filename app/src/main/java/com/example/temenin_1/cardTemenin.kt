package com.example.temenin_1
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


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
                .size(72.dp)
                .shadow(
                    elevation = 8.dp,
                    shape = RoundedCornerShape(8.dp)
                )

        ) {

        }
    }
}