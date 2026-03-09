package com.example.jetpackcomposehomework

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.*
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.unit.*

@Composable
fun SearchBar() {

    var text by remember {
        mutableStateOf("")
    }

    OutlinedTextField(
        value = text,
        onValueChange =
            {
            text = it
                        },

        placeholder = { Text("بحث") },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Close,
                contentDescription = null,
                tint = Color.Red
            )
        },
        trailingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null
            )
        },
        shape = RoundedCornerShape(25.dp),
        modifier = Modifier.fillMaxWidth()
    )
}