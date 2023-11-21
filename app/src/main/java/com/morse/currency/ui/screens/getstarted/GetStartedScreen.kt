package com.morse.currency.ui.screens.getstarted

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.morse.currency.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GetStartedScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.get_started_bg),
            contentDescription = "Application Background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillWidth
        )
        Image(
            painter = painterResource(id = R.drawable.circule_lines),
            contentDescription = "Application lines",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.FillWidth
        )

        Column(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .height(300.dp)
                .width(100.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.star_1),
                modifier = Modifier
                    .padding(start = 60.dp, top = 60.dp)
                    .size(20.dp),
                contentDescription = "Star 1"
            )

            Image(
                painter = painterResource(id = R.drawable.star_2),
                modifier = Modifier
                    .padding(start = 10.dp, top = 30.dp)
                    .size(40.dp),
                contentDescription = "Star 2"
            )
        }

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = R.drawable.credits),
                modifier = Modifier.padding(top = 90.dp),
                contentDescription = "Credits"
            )

            Text(
                text = "Make with you money move with you",
                modifier = Modifier.padding(20.dp),
                
                )

        }

    }
}