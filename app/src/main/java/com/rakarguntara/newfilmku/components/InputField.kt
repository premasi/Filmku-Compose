package com.rakarguntara.newfilmku.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rakarguntara.newfilmku.R

@Composable
fun InputField(
    valueState: MutableState<String>,
    labelId: String,
    enabled: Boolean,
    isSingleLine: Boolean  = true,
    keyboardType: KeyboardType = KeyboardType.Text,
    imeAction: ImeAction = ImeAction.Next,
    keyboardAction: KeyboardActions = KeyboardActions.Default
) {
    OutlinedTextField(
        colors = TextFieldDefaults.colors(
            focusedTextColor = colorResource(R.color.navy),
            focusedContainerColor = colorResource(R.color.white),
            focusedIndicatorColor = colorResource(R.color.orange),
            focusedLabelColor = colorResource(R.color.navy),
            unfocusedTextColor = colorResource(R.color.dark_gray),
            unfocusedContainerColor = colorResource(R.color.white),
            unfocusedIndicatorColor = colorResource(R.color.dark_gray),
            unfocusedLabelColor = colorResource(R.color.dark_gray)
        ),
        value = valueState.value,
        onValueChange = { newVal ->
            valueState.value = newVal
        },
        textStyle = TextStyle(color = colorResource(R.color.black)),
        label = {Text(labelId, style = TextStyle(color = colorResource(R.color.black), fontWeight = FontWeight.Normal, fontSize = 12.sp))},
        singleLine = isSingleLine,
        modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 16.dp),
        enabled = enabled,
        keyboardOptions = KeyboardOptions.Default.copy(
            imeAction = imeAction,
            keyboardType = keyboardType,
        ),
        keyboardActions = keyboardAction
    )
}