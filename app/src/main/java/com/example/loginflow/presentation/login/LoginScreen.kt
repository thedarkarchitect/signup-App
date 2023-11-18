package com.example.loginflow.presentation.login


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginflow.presentation.components.ButtonComponent
import com.example.loginflow.presentation.components.ClickableLoginTextComponent
import com.example.loginflow.presentation.components.DividerComponent
import com.example.loginflow.presentation.components.HeadingTextComponent
import com.example.loginflow.presentation.components.MyPasswordTextField
import com.example.loginflow.presentation.components.MyTextField
import com.example.loginflow.presentation.components.NormalTextComponent
import com.example.loginflow.presentation.components.UnderLinedNormalTextComponent
import com.example.loginflow.ui.theme.LoginFlowTheme
import com.example.loginflow.util.UiEvent

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    onEvent: (UiEvent) -> Unit
) {
    Surface(
        modifier = modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = modifier
                .padding(28.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            NormalTextComponent(value = "hello")
            HeadingTextComponent(value = "LoginAccount")
            Spacer(modifier = modifier.height(20.dp))
            MyTextField(labelValue = "Email...", leadingIcon = Icons.Default.Email, onTextChanged = { onEvent(UiEvent.EmailChanged(it)) })
            MyPasswordTextField(label = "Enter Password", leadingIcon = Icons.Default.Lock, onTextChanged = { onEvent(UiEvent.PasswordChanged(it))})
            Spacer(modifier = modifier.height(30.dp))
            
            UnderLinedNormalTextComponent(value = "Forgot your password?")
            
            Spacer(modifier = modifier.height(5.dp))
            ButtonComponent(
                value = "Login",
                onButtonClicked = {}
                )

            Spacer(modifier = modifier.height(10.dp))
            DividerComponent()

            ClickableLoginTextComponent(tryingToLogin = true)
        }
    }
}

@Preview
@Composable
fun LoginScreenPreview(
    modifier: Modifier = Modifier
){
    LoginFlowTheme {
        Surface(
            color = Color.White,
            modifier = modifier
                .fillMaxSize()
//                .padding(28.dp)
        ) {
            LoginScreen(
                onEvent = {}
            )
        }
    }
}