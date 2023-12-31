package com.example.loginflow.presentation.signup


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginflow.data.RegistrationUiState
import com.example.loginflow.presentation.components.ButtonComponent
import com.example.loginflow.presentation.components.CheckboxComponent
import com.example.loginflow.presentation.components.ClickableLoginTextComponent
import com.example.loginflow.presentation.components.DividerComponent
import com.example.loginflow.presentation.components.HeadingTextComponent
import com.example.loginflow.presentation.components.MyPasswordTextField
import com.example.loginflow.presentation.components.MyTextField
import com.example.loginflow.presentation.components.NormalTextComponent
import com.example.loginflow.ui.theme.LoginFlowTheme
import com.example.loginflow.util.UiEvent

@Composable
fun SignUpScreen(
    modifier: Modifier = Modifier,
    state: RegistrationUiState,
    onEvent: (UiEvent) -> Unit
) {
    Surface(
        color = Color.White,
        modifier = modifier
            .fillMaxSize()
//            .padding(28.dp)
    ) {
        Column(
            modifier = modifier
                .padding(28.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            NormalTextComponent(value = "hello")
            HeadingTextComponent(value = "Create Account")
            MyTextField(labelValue = "First Name",
                leadingIcon = Icons.Default.Person,
                onTextChanged = {
                    onEvent(UiEvent.FirstNameChanged(it))
                }
                )
            MyTextField(
                labelValue = "Last Name",
                leadingIcon = Icons.Default.Person,
                onTextChanged = {
                    onEvent(UiEvent.LastNameChanged(it))
                }
            )
            MyTextField(
                labelValue = "Email...",
                leadingIcon = Icons.Default.Email,
                onTextChanged = {
                    onEvent(UiEvent.EmailChanged(it))
                }
            )
            MyPasswordTextField(
                label = "Enter Password",
                leadingIcon = Icons.Default.Lock,
                onTextChanged = {
                    onEvent(UiEvent.PasswordChanged(it))
                }
            )
            CheckboxComponent()

            Spacer(modifier = modifier.height(40.dp))
            ButtonComponent(value = "Register", onButtonClicked = {})

            Spacer(modifier = modifier.height(20.dp))
            DividerComponent()
            ClickableLoginTextComponent(tryingToLogin = true)
        }
    }
}

@Preview
@Composable
fun SignupScreenPreview(
    modifier: Modifier = Modifier
){
    LoginFlowTheme {
        Surface(
            color = Color.White,
            modifier = modifier
                .fillMaxSize()
//                .padding(28.dp)
        ) {
            SignUpScreen(
                state = RegistrationUiState(
                    firstName = "",
                    lastName = "",
                    email = "",
                    password = ""
                ),
                onEvent = {}
            )
        }
    }
}