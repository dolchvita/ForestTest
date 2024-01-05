package com.snd.foresttest.ui.user.register

import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.snd.foresttest.base.TMViewModel
import com.snd.foresttest.data.util.Event

class RegisterViewModel : TMViewModel() {

    val id = ObservableField<String>()
    val pass = ObservableField<String>()
    val passCheck = ObservableField<String>()
    val name = ObservableField<String>()
    val phone = ObservableField<String>()
    val email = ObservableField<String>()

    private val _click = MutableLiveData<Event<Unit>>()
    val click: LiveData<Event<Unit>> get() = _click



    fun onRegiterClick(){
        log("아이디 확인 1" + id.get())
        log("아이디 확인 2" + pass.get())
        log("아이디 확인 3" + passCheck.get())
        log("아이디 확인 4" + name.get())
        log("아이디 확인 5" + phone.get())

        //_click.value = Event(Unit)
    }


}