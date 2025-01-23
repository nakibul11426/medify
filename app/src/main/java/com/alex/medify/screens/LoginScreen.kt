package com.alex.medify.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.width
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
import com.alex.medify.components.RoundedEditText
import com.alex.medify.navigation.Screen
import com.alex.medify.ui.theme.helvetica
import com.alex.medify.ui.theme.textColor

@Composable
fun LoginScreen(modifier: Modifier = Modifier, navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.login_screen_bg),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 30.dp, horizontal = 16.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(60.dp))
            Text(
                text = stringResource(R.string.welcome_back_text),
                style = TextStyle(
                    fontSize = 40.sp,
                    fontWeight = FontWeight.W800,
                    color = textColor,
                ),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = stringResource(R.string.we_are_happy_to_see_you_again_please_enter_your_email_and_password_text),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W100,
                    color = Color.White,
                    fontFamily = helvetica,
                    letterSpacing = 1.sp,
                    lineHeight = 30.sp
                ),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(48.dp))
            RoundedEditText(optionText = "Email", onValueChange = { input ->
                println("Current text: $input")
            })
            Spacer(modifier = Modifier.height(24.dp))
            RoundedEditText(optionText = "Password", onValueChange = { input ->
                println("Current text: $input")
            })
            Spacer(modifier = Modifier.height(48.dp))
            CustomRoundedButton(
                onClick = {
                    navController.navigate(Screen.LoginScreen.route)
                },
                buttonText = stringResource(R.string.log_in_text)
            )
            Spacer(modifier = Modifier.height(32.dp))
            Text(
                text = stringResource(R.string.forgot_password_text),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W100,
                    color = textColor,
                    fontFamily = helvetica,
                    letterSpacing = 1.sp,
                    lineHeight = 30.sp
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier.clickable {

                }
            )
            Spacer(modifier = Modifier.height(42.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Spacer(
                    modifier = Modifier
                        .height(1.dp)
                        .width(100.dp)
                        .background(Color.Gray)
                )
                Text(
                    text = stringResource(R.string.or_text), style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.W100,
                        color = Color.White,
                        fontFamily = helvetica,
                        letterSpacing = 1.sp,
                        lineHeight = 30.sp
                    ),
                    modifier = Modifier.padding(horizontal = 8.dp)
                )
                Spacer(
                    modifier = Modifier
                        .height(1.dp)
                        .width(100.dp)
                        .background(Color.Gray)
                )

            }
            Spacer(modifier = Modifier.height(42.dp))

            CustomRoundedButton(
                onClick = {
                    navController.navigate(Screen.LoginScreen.route)
                },
                buttonText = stringResource(R.string.create_account_text)
            )

        }
    }
}