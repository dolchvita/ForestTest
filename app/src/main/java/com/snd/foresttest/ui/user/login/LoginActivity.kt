package com.snd.foresttest.ui.user.login

import android.content.Context
import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.snd.foresttest.R
import com.snd.foresttest.base.TMActivity
import com.snd.foresttest.databinding.ActLoginBinding


class LoginActivity : TMActivity() {

    // 지금 바로 생성이 안 된다면 늦은 초기화 객체로 선언한다.
    lateinit var bb : ActLoginBinding
    private val loginVM : LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bb = DataBindingUtil.setContentView(this, R.layout.act_login)

        val context: Context = this
        val bitmap = BitmapFactory.decodeResource(context.resources, R.drawable.logo_kofpy)

        val imageView : ImageView = bb.logoLogin
        imageView.setImageBitmap(bitmap)

    }

    /* TODO : Login Flow 구현 by Kotlin
    *   UserRepo --> Login & Registrarion */

}