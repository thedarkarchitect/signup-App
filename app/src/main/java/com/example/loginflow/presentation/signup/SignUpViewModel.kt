package com.example.loginflow.presentation.signup

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.loginflow.data.RegistrationUiState
import com.example.loginflow.util.UiEvent

class SignUpViewModel : ViewModel() {
    private var _state = mutableStateOf(RegistrationUiState())
    var state = _state

    fun onEvent(event: UiEvent){
        when(event){
            is UiEvent.EmailChanged -> {
                _state.value = state.value.copy(
                    email = event.email
                )
            }
            is UiEvent.FirstNameChanged -> {
                _state.value = state.value.copy(
                    firstName = event.firstName
                )
            }
            is UiEvent.LastNameChanged -> {
                _state.value = state.value.copy(
                    lastName = event.lastName
                )
            }
            is UiEvent.PasswordChanged -> {
                _state.value = state.value.copy(
                    password = event.password
                )
            }

            UiEvent.RegistrationButtonClicked -> {
                signUp()
            }
        }
    }

    private fun signUp(){
        Log.d(TAG,"Inside_signUp")
    }
}