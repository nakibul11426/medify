package com.alex.medify.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RoundedEditText(onValueChange: (String) -> Unit, optionText: String) {
    val textState = rememberSaveable(stateSaver = textFieldValueSaver) {
        mutableStateOf(TextFieldValue(""))
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Transparent)
            .padding(0.dp)
    ) {
        OutlinedTextField(
            value = textState.value,
            onValueChange = {
                textState.value = it
                onValueChange(it.text) // Invoke callback with current text
            },
            label = { Text(optionText, color = Color.Gray) },
            shape = RoundedCornerShape(100.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                cursorColor = Color.White,
                focusedBorderColor = Color.White,
                unfocusedBorderColor = Color.Gray
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            textStyle = LocalTextStyle.current.copy(color = Color.White),
            singleLine = true
        )
    }
}

private val textFieldValueSaver = Saver<TextFieldValue, String>(
    save = { it.text },
    restore = { TextFieldValue(it) }
)

