package com.snd.foresttest.ui.user.login

import androidx.databinding.ObservableField
import com.snd.foresttest.base.TMViewModel

class LoginViewModel : TMViewModel(){

    // MVVM 패턴으로 데이터 처리하기
    val id = ObservableField<String>()
    val password = ObservableField<String>()



}