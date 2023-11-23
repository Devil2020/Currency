package com.morse.currency.ui.screens.getstarted

import android.widget.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.morse.currency.R
import com.morse.currency.ui.theme.Yellow

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

        ConstraintLayout(
            modifier = Modifier.fillMaxSize(),
        ) {

            val (cardsImage, title, body, button) = createRefs()
            Image(
                painter = painterResource(id = R.drawable.credits),
                modifier = Modifier.constrainAs(cardsImage) {
                    top.linkTo(parent.top, 90.dp)
                    linkTo(parent.start, parent.end)
                },
                contentDescription = "Credits"
            )

            Text(
                text = "Make with you money move with you",
                modifier = Modifier
                    .constrainAs(title) {
                        top.linkTo(cardsImage.bottom, 20.dp)
                        linkTo(parent.start, parent.end,20.dp)
                        width = Dimension.fillToConstraints
                    },
                style = MaterialTheme.typography.bodyLarge,
                fontSize = 30.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                lineHeight = 40.sp
            )

            Text(
                text = "Most of the things in our app are managed with gestures",
                modifier = Modifier.constrainAs(body) {
                    top.linkTo(title.bottom, 15.dp)
                    linkTo(parent.start, parent.end, 60.dp , 60.dp)
                    width = Dimension.fillToConstraints
                },
                style = MaterialTheme.typography.bodySmall,
                fontSize = 16.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                lineHeight = 20.sp
            )

            TextButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .constrainAs(button) {
                        bottom.linkTo(parent.bottom, 20.dp)
                    },
                shape = RoundedCornerShape(40.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Yellow)
            ) {
                Text(text = "Get Started", color = Color.Black , modifier = Modifier.padding(vertical = 10.dp) , style = MaterialTheme.typography.bodyMedium)
            }

        }

    }
}