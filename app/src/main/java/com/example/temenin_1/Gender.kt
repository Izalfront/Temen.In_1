package com.example.temenin_1


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun Gender(){
    val male = painterResource(id = R.drawable.men_line)
    val female = painterResource(id = R.drawable.women_line)
    Row (
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ){
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(24.dp))
                .background(Color.Gray.copy(alpha = 0.1f))
                .padding(16.dp)
                .clickable {}
                .size(56.dp)
        ){
            Icon(
                painter = female,
                contentDescription = "",
                tint = Color.Magenta.copy(alpha = 0.4f),
                modifier = Modifier
                    .size(45.dp)
                    .align(Alignment.Center)
            )
        }
        Spacer(modifier = Modifier.width(60.dp))
//        female
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(24.dp))
                .background(Color.Gray.copy(alpha = 0.1f))
                .padding(16.dp)
                .clickable {}
                .size(56.dp)
        ){
            Icon(
                painter = male,
                contentDescription = "",
                tint = Color.Blue.copy(alpha = 0.4f),
                modifier = Modifier
                    .size(45.dp)
                    .align(Alignment.Center)
            )
        }
    }
}
