package com.niharikainala.funfacts.data

sealed class UserDataUIEvents{
    data class UserNameEntered(val name:String): UserDataUIEvents()
    data class AnimalSelected(val animalValue:String) : UserDataUIEvents()
}
