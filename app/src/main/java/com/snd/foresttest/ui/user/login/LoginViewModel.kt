package com.snd.foresttest.ui.user.login

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel(){

    // MVVM 패턴으로 데이터 처리하기
    val id = ObservableField<String>()
    val password = ObservableField<String>()



}