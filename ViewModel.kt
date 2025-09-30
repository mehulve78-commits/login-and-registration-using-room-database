package com.app.loginandregisterusingroomdatabase

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.runBlocking
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class AuthViewModel(private val userRepository: UserRepository) : ViewModel() {
    fun insertUser(user: User) {
        viewModelScope.launch {
            userRepository.insertUser(user)
        }
    }

    fun getUser(username: String, password: String): User? {
        return runBlocking {
            userRepository.getUser(username, password)
        }
    }
}
