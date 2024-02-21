package com.example.temenin_1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.temenin_1.data.BottomNavigation

val items = listOf(
    BottomNavigation(
        title = "Home",
        icon = R.drawable.home_5_line
    ),
    BottomNavigation(
        title = "Chat",
        icon =R.drawable.message_3_line
    ),
    BottomNavigation(
        title = "History",
        icon = R.drawable.history_line
    ),
    BottomNavigation(
        title = "Profile",
        icon = R.drawable.user_line
    )
)

@Preview
@Composable
fun BottomNavigationBar(){
    NavigationBar {
        Row (
            modifier = Modifier
                .background(MaterialTheme.colorScheme.background)
                .drawBehind {
                    // Gambar garis outline di bagian atas
                    drawLine(
                        color = Color.Black.copy(alpha = 0.5f),
                        start = Offset(0f, 0f),
                        end = Offset(size.width, 0f),
                        strokeWidth = 1f
                    )
                }
        ){
            items.forEachIndexed { index, item ->
                NavigationBarItem(
                    selected = index == 0,
                    onClick = { /*TODO*/ },
                    icon = { 
                        Icon(painter = painterResource(id = item.icon),
                            contentDescription = item.title,
                            tint = if (index == 0) {
                                MaterialTheme.colorScheme.primary
                            } else {
                                MaterialTheme.colorScheme.onBackground.copy(alpha = 0.5f)
                            }
                        )
                    },
                    label = {
                        Text(text = item.title,
                            color = if (index == 0 ){
                                MaterialTheme.colorScheme.primary
                            }else{
                                MaterialTheme.colorScheme.onBackground.copy(alpha = 0.5f)
                            }
                        )
                    },
                    modifier = Modifier.background(Color.Transparent)
                )
            }

        }
    }
}
