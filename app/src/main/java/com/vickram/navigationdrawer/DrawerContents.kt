/*
package com.vickram.navigationdrawer

import android.graphics.drawable.PaintDrawable
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DrawerContents() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Magenta)
            .padding(top = 8.dp, bottom = 20.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_home_24),
                contentDescription = "home",
                tint = Color.White
            )
            Text(
                text = "Home",
                style = TextStyle(Color.White),
                modifier = Modifier.padding(start = 10.dp)
            )
        }
        Spacer(modifier = Modifier.height(5.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_message_24),
                contentDescription = "messages",
                tint = Color.White
            )
            Text(
                text = "Messages",
                style = TextStyle(Color.White),
                modifier = Modifier.padding(start = 10.dp)
            )
        }
        Spacer(modifier = Modifier.height(5.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_circle_notifications_24),
                contentDescription = "notification",
                tint = Color.White
            )
            Text(
                text = "Notifications",
                style = TextStyle(Color.White),
                modifier = Modifier.padding(start = 10.dp)
            )
        }
        Spacer(modifier = Modifier.height(5.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_person_24),
                contentDescription = "profile",
                tint = Color.White
            )
            Text(
                text = "Profile",
                style = TextStyle(Color.White),
                modifier = Modifier.padding(start = 10.dp)
            )
        }
        Spacer(modifier = Modifier.height(5.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_payment_24),
                contentDescription = "payment",
                tint = Color.White
            )
            Text(
                text = "Payments",
                style = TextStyle(Color.White),
                modifier = Modifier.padding(start = 10.dp)
            )
        }
        Spacer(modifier = Modifier.height(5.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_settings_24),
                contentDescription = "settings",
                tint = Color.White
            )
            Text(
                text = "Settings ",
                style = TextStyle(Color.White),
                modifier = Modifier.padding(start = 10.dp)
            )
        }
        Spacer(modifier = Modifier.height(5.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_logout_24),
                contentDescription = "logout",
                tint = Color.White
            )
            Text(
                text = "Log Out",
                style = TextStyle(Color.White),
                modifier = Modifier.padding(start = 10.dp)
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DrawerPreview(){
    DrawerContents()
}*/
