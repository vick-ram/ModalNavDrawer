/*
package com.vickram.navigationdrawer

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DrawerHeader() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Magenta)
            .padding(bottom = 10.dp, top = 15.dp)
            .clip(shape = CircleShape),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.myic_launcher),
            contentDescription = null,
        )
        Text(
            text = "Vickram",
            Modifier.padding(top = 8.dp),
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            style = TextStyle(Color.White)
        )
        Text(
            text = "vickramodero6@gmail.com",
            modifier = Modifier.padding(top = 8.dp),
            fontSize = 16.sp,
            style = TextStyle(Color.White)
        )
    }
}

@Composable
@Preview(showBackground = true)
fun HeaderPreview() {
    DrawerHeader()
}*/
