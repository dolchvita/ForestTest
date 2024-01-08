package com.snd.foresttest.ui.user.register

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.snd.foresttest.base.TMViewModel
import com.snd.foresttest.data.util.Event
import com.snd.foresttest.dto.user.UserDTO

class RegisterViewModel : TMViewModel() {
    val userId = MutableLiveData<String>()
    val userPass = MutableLiveData<String>()
    val userPassCheck = MutableLiveData<String>()
    val userName = MutableLiveData<String>()
    val userPhone = MutableLiveData<String>()
    val userEmail = MutableLiveData<String>()

    private val _click = MutableLiveData<Event<Unit>>()
    val click: LiveData<Event<Unit>> get() = _click


    fun createUserDTO(): UserDTO {
        return UserDTO().apply {
            id = userId.value?: ""
            password = userPass.value ?: ""
            name = userName.value ?: ""
            phone = userPhone.value ?: ""
            email = userEmail.value ?: ""
        }
    }


    fun onRegiterClick(){
        val userDTO = createUserDTO()
        // 매핑완
        log("디티오 확인 * " + userDTO )
    }


}