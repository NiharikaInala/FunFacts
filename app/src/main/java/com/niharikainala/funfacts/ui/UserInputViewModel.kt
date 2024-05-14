package com.niharikainala.funfacts.ui

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.niharikainala.funfacts.data.UserDataUIEvents
import com.niharikainala.funfacts.data.UserInputScreenState

class UserInputViewModel: ViewModel(){

    var uiState = mutableStateOf(UserInputScreenState())

    fun onEvent(event:UserDataUIEvents){
        when(event){
            is UserDataUIEvents.UserNameEntered ->{
                uiState.value = uiState.value.copy(
                    nameEntered = event.name
                )
            }

            is UserDataUIEvents.AnimalSelected -> {
                uiState.value = uiState.value.copy(
                    animalSelected = event.animalValue
                )
            }
        }
    }

    fun isValidState(): Boolean{
        return uiState.value.nameEntered.isNotEmpty() &&
                uiState.value.animalSelected.isNotEmpty()
    }

}



