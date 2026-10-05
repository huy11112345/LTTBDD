package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            StudentProfile(
                onBackClick = {
                    finish()
                }
            )
        }
    }
}

@Composable
fun StudentProfile(
    onBackClick: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(
                start = 24.dp,
                end = 24.dp,
                top = 20.dp,
                bottom = 20.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // THANH TRÊ

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            // Nút quay lại
            Box(
                modifier = Modifier
                    .size(44.dp)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFE0E0E0),
                        shape = RoundedCornerShape(8.dp)
                    )
                    .clickable {
                        onBackClick()
                    },
                contentAlignment = Alignment.Center
            ) {

                Text(
                    text = "←",
                    fontSize = 27.sp,
                    color = Color(0xFF222222)
                )
            }

            // Nút chỉnh sửa
            Box(
                modifier = Modifier
                    .size(44.dp)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFE0E0E0),
                        shape = RoundedCornerShape(8.dp)
                    )
                    .clickable {
                        // Có thể thêm chức năng chỉnh sửa sau
                    },
                contentAlignment = Alignment.Center
            ) {

                Text(
                    text = "✎",
                    fontSize = 24.sp,
                    color = Color(0xFF4CAF50)
                )
            }
        }

        // Khoảng cách phía trên avatar
        Spacer(
            modifier = Modifier.height(135.dp)
        )

        // ẢNH ĐẠI DIỆN

        Image(
            painter = painterResource(
                id = R.drawable.avatar
            ),
            contentDescription = "Ảnh đại diện sinh viên",
            modifier = Modifier
                .size(155.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        // Khoảng cách
        Spacer(
            modifier = Modifier.height(25.dp)
        )

        // HỌ TÊN

        Text(
            text = "Bạch Hoàng Huy",
            fontSize = 27.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF222222)
        )

        // Khoảng cách
        Spacer(
            modifier = Modifier.height(8.dp)
        )

        // MÃ SINH VIÊN

        Text(
            text = "SV077206010374",
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            color = Color(0xFF777777)
        )
    }
}