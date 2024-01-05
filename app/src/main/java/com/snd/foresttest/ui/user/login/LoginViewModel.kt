package com.snd.foresttest.ui.user.login

import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.snd.foresttest.base.TMViewModel
import com.snd.foresttest.data.util.Event

class LoginViewModel : TMViewModel(){

    // MVVM 패턴으로 데이터 처리하기
    val id = ObservableField<String>()
    val password = ObservableField<String>()

    private val _onRegiterClick = MutableLiveData<Event<Unit>>()
    val onRegiterClick: LiveData<Event<Unit>> get() = _onRegiterClick



    // 사용자 등록하기 버튼
    fun onRegiterClick(){
        _onRegiterClick.value = Event(Unit)
    }


}