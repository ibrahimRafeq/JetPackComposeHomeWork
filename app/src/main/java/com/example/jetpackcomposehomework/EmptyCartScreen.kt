package com.example.jetpackcomposehomework

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val BrandBrown = Color(0xFF94745B)

@Composable
fun EmptyCartScreen() {
    Scaffold(
        bottomBar = { BottomNavigationBar() }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(paddingValues)
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "سلة المشتريات",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 16.dp)
            )

            Spacer(modifier = Modifier.weight(0.5f))


            Text("🛒", fontSize = 100.sp)

            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = "لم تقم بأضافة اي منتج الى السلة مؤخراً",
                fontSize = 18.sp,
                color = Color.Black,
                fontWeight = FontWeight.Medium
            )

            Spacer(modifier = Modifier.height(48.dp))

            Button(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                colors = ButtonDefaults.buttonColors(containerColor = BrandBrown),
                shape = RoundedCornerShape(28.dp)
            ) {
                Text(
                    text = "اذهب لتسوق الان",
                    fontSize = 18.sp,
                    color = Color.White
                )
            }

            Spacer(modifier = Modifier.weight(1f))
        }
    }
}

@Composable
fun BottomNavigationBar() {
    NavigationBar(
        containerColor = Color.White,
        tonalElevation = 8.dp
    ) {
        val items = listOf(
            Icons.Default.Home to "الرئيسية",
            Icons.Default.FavoriteBorder to "المفضلة",
            Icons.Default.ShoppingCart to "السلة",
            Icons.Default.DateRange to "طلباتي",
            Icons.Default.AccountCircle to "حسابي"
        )

        items.reversed().forEachIndexed { index, item ->
            NavigationBarItem(
                selected = index == 2,
                onClick = { },
                icon = {
                    Icon(
                        imageVector = item.first,
                        contentDescription = null,
                        tint = if (index == 2) BrandBrown else Color.Gray
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    indicatorColor = Color.Transparent
                )
            )
        }
    }
}