package com.example.jetpackcomposehomework

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*


@Composable
fun BottomNavigationBar(modifier: Modifier = Modifier) {

    NavigationBar(
        modifier = modifier
    ) {

        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = {
                Icon(Icons.Default.FavoriteBorder, contentDescription = "")
            }
        )

        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = {
                Icon(Icons.Default.FavoriteBorder, contentDescription = "")
            }
        )

        NavigationBarItem(
            selected = true,
            onClick = { },
            icon = {
                Icon(Icons.Default.ShoppingCart, contentDescription = "")
            }
        )

        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = {
                Icon(Icons.Default.FavoriteBorder, contentDescription = "")
            }
        )

        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = {
                Icon(Icons.Default.Home, contentDescription = "")
            }
        )
    }
}