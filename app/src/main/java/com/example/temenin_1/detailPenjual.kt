package com.example.temenin_1


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.temenin_1.ui.theme.Female
import com.example.temenin_1.ui.theme.bgGray


@Preview(showBackground = true)
@Composable
fun DetailPenjual() {

        Box() {
            Box(
                modifier = Modifier
                    .background(
                        bgGray,
                        shape = RoundedCornerShape(topEnd = 20.dp, topStart = 20.dp)
                    )
                    .fillMaxHeight(0.6f)
                    .fillMaxSize()
                    .align(Alignment.BottomCenter)
                    .padding(12.dp)
                    .zIndex(1f)
            ) {
                Column {
                    Box(
                        modifier = Modifier
                            .padding(20.dp)
                            .background(Color.White, shape = RoundedCornerShape(16.dp))
                            .fillMaxWidth()
                            .wrapContentHeight()
                    ) {
                        Column(modifier = Modifier.padding(18.dp)) {
                            Text(
                                text = "Ayu Ananda",
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(bottom = 6.dp)
                            )
                            Text(
                                text = "Lorem ipsum dolor sit amet",
                                fontWeight = FontWeight.Normal,
                                fontSize = 14.sp,
                                color = Color.Gray.copy(alpha = 0.7f)
                            )
//                      Nama dan Deskripsi
                            Spacer(modifier = Modifier.padding(8.dp))

                            Text(
                                text = "Rating & Handle",
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 14.sp,
                                color = Female,
                                modifier = Modifier.padding(bottom = 10.dp)
                            )
                            Row(
                                modifier = Modifier
                                    .background(bgGray, shape = RoundedCornerShape(4.dp))
                                    .padding(vertical = 2.dp, horizontal = 16.dp)
                                    .height(IntrinsicSize.Min),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.star_fill),
                                    contentDescription = "cewe",
                                    tint = Female,
                                    modifier = Modifier
                                        .size(28.dp)
                                        .padding(end = 8.dp)
                                )
                                Text(
                                    text = "4.3 (50)",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Female
                                )
                            }
//                      Rating & Handle
                            Spacer(modifier = Modifier.padding(10.dp))

                            Text(
                                text = "Ini Price List Ku",
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 14.sp,
                                color = Color.Black,
                                modifier = Modifier.padding(bottom = 10.dp)
                            )
                            Row(
                                modifier = Modifier
                                    .background(bgGray, shape = RoundedCornerShape(4.dp))
                                    .padding(vertical = 2.dp, horizontal = 16.dp)
                                    .height(IntrinsicSize.Min),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.history_line),
                                    contentDescription = "pricelist",
                                    tint = Female,
                                    modifier = Modifier
                                        .size(28.dp)
                                        .padding(end = 8.dp)
                                )
                                Text(
                                    text = "1 jam : Rp. 50.000",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color.Black
                                )
                            }
//                      PriceList
                            Spacer(modifier = Modifier.padding(10.dp))

                            Text(
                                text = "Aku punya waktu di jam ini",
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 14.sp,
                                color = Color.Black,
                                modifier = Modifier.padding(bottom = 10.dp)
                            )
                            Row(
                                modifier = Modifier
                                    .background(bgGray, shape = RoundedCornerShape(4.dp))
                                    .padding(vertical = 2.dp, horizontal = 16.dp)
                                    .height(IntrinsicSize.Min),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.history_line),
                                    contentDescription = "pricelist",
                                    tint = Female,
                                    modifier = Modifier
                                        .size(28.dp)
                                        .padding(end = 8.dp)
                                )
                                Text(
                                    text = "1 jam : Rp. 50.000",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color.Black,
                                )
                            }
//                      Jam Buka
                        }
                    }
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .height(45.dp)
                            .align(Alignment.CenterHorizontally),
                        colors = ButtonDefaults.buttonColors(
                             Female,
                            contentColor = Color.White
                        )
                    ) {
                        Row (verticalAlignment = Alignment.CenterVertically){
                            Icon(
                                painter = painterResource(id = R.drawable.message_3_line),
                                contentDescription = stringResource(id = R.string.app_name),
                                modifier = Modifier.width(24.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text("Hubungi Saya")
                        }
                    }
                    Spacer(modifier = Modifier.padding(6.dp))
//                    Ulasan Pelanggan
                }
            }
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(id = R.drawable.testing),
                contentDescription = null,
                alignment = Alignment.TopStart
            )
        }


}
