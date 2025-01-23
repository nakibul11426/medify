package com.alex.medify.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.alex.medify.R
import com.alex.medify.components.CustomRoundedButton
import com.alex.medify.navigation.Screen
import com.alex.medify.ui.theme.helvetica

@Composable
fun StartingScreen(modifier: Modifier = Modifier, navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.start_screen_bg),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(R.string.begin_again_text),
                style = TextStyle(
                    fontSize = 50.sp,
                    fontWeight = FontWeight.W800,
                    color = Color.White,
                ),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = stringResource(R.string.embrace_tranquility_text),
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.W200,
                    color = Color.White,
                    fontFamily = helvetica,
                    letterSpacing = 0.5.sp
                ),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(70.dp))
            CustomRoundedButton(
                onClick = {
                    navController.navigate(Screen.RegistrationScreen.route)
                },
                buttonText = stringResource(R.string.sign_up_text)
            )
            Spacer(modifier = Modifier.height(24.dp))
            CustomRoundedButton(
                onClick = {
                    navController.navigate(Screen.LoginScreen.route)
                },
                buttonText = stringResource(R.string.log_in_text)
            )
            Spacer(modifier = Modifier.height(70.dp))
        }
    }
}