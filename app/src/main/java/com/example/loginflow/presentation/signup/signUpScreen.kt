package com.example.loginflow.presentation.signup

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginflow.presentation.components.HeadingTextComponent
import com.example.loginflow.presentation.components.MyTextField
import com.example.loginflow.presentation.components.NormalTextComponent
import com.example.loginflow.ui.theme.LoginFlowTheme

@Composable
fun SignUpScreen(
    modifier: Modifier = Modifier
) {
    Surface(
        color = Color.White,
        modifier = modifier
            .fillMaxSize()
            .padding(28.dp)
    ) {
        Column(
            modifier = modifier
        ){
            NormalTextComponent(value = "hello")
            HeadingTextComponent(value = "Create Account")
            MyTextField(labelValue = "First Name")
        }
    }
}

@Preview
@Composable
fun SignupScreenPreview(){
    LoginFlowTheme {
        SignUpScreen()
    }
}