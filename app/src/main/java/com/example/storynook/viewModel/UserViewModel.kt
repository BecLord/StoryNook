package com.example.storynook.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.storynook.data.User
import com.example.storynook.data.UserDao
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class UserViewModel(private val dao: UserDao) : ViewModel() {
    val users: StateFlow<List<User>> = dao.getAllUsers()
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = emptyList()
        )

    fun addUser(user: User) {
        if (user.name.isBlank()) return
        viewModelScope.launch {
            dao.insertUser(
                user.copy(name = user.name.trim())
            )
        }
    }

    fun deleteUser(user: User) {
        viewModelScope.launch {
            dao.deleteUser(user)
        }
    }
}
