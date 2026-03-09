package com.example.jetpackcomposehomework

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val BrownButton = Color(0xFF94745B)
val LightGrayBg = Color(0xFFF8F8F8)

@Composable
fun ShoppingCartScreen() {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.End
    ) {
        Spacer(modifier = Modifier.height(24.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = {  }) {
                Icon(Icons.Default.Delete, contentDescription = null, tint = Color.Red)
            }

            Text(
                text = "سلة المشتريات",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 8.dp)
        ) {
            Text(text = "3 منتجات", color = Color.Gray)
            Checkbox(checked = false, onCheckedChange = {})
        }

        LazyColumn(modifier = Modifier.weight(1f)) {
            items(2) {
                CartItem()
            }
        }

        Divider(thickness = 0.5.dp, color = Color.LightGray)

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "$36", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text(text = "التكلفة", fontSize = 18.sp)
        }

        Button(
            onClick = {  },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            colors = ButtonDefaults.buttonColors(containerColor = BrownButton),
            shape = RoundedCornerShape(28.dp)
        ) {
            Text(text = "شراء", fontSize = 18.sp, color = Color.White)
        }

        Spacer(modifier = Modifier.height(32.dp))

    }
}

@Composable
fun CartItem() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(2.dp),
        shape = RoundedCornerShape(12.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ) {
            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.End
            ) {
                Text(text = "حذاء رياضي", fontWeight = FontWeight.Medium)
                Text(text = "المقاس : 42  اللون : ●", color = Color.Gray, fontSize = 14.sp)

                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "$18", fontWeight = FontWeight.Bold)

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        QuantityButton(Icons.Default.Clear, BrownButton.copy(alpha = 0.5f))
                        Text(text = "1", modifier = Modifier.padding(horizontal = 8.dp))
                        QuantityButton(Icons.Default.Add, BrownButton)
                    }
                }
            }

            Spacer(modifier = Modifier.width(12.dp))

            Box(
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color(0xFFFDF5F0)),
                contentAlignment = Alignment.Center
            ) {
                Text("👟", fontSize = 40.sp)
            }

            Checkbox(checked = true, onCheckedChange = {})
        }
    }
}

@Composable
fun QuantityButton(icon: androidx.compose.ui.graphics.vector.ImageVector, color: Color) {
    Surface(
        modifier = Modifier.size(24.dp),
        shape = RoundedCornerShape(4.dp),
        color = color
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.padding(4.dp)
        )
    }
}