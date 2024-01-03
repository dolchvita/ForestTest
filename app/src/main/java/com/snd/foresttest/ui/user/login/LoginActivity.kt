package com.snd.foresttest.ui.user.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.snd.foresttest.R
import com.snd.foresttest.databinding.ActLoginBinding

class LoginActivity : AppCompatActivity() {

    // 지금 바로 생성이 안 된다면 늦은 초기화 객체로 선언한다.
    lateinit var bb : ActLoginBinding
    //override val loginVM : LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bb = DataBindingUtil.setContentView(this, R.layout.act_login)

    }

    /* TODO : Login Flow 구현 by Kotlin
    *   UserRepo --> Login & Registrarion */

}