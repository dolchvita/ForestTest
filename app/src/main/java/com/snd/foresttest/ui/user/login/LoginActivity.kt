package com.snd.foresttest.ui.user.login

import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.snd.foresttest.R
import com.snd.foresttest.base.TMActivity
import com.snd.foresttest.databinding.LoginActBinding
import com.snd.foresttest.ui.user.register.RegisterActivity


class LoginActivity : TMActivity() {

    // 지금 바로 생성이 안 된다면 늦은 초기화 객체로 선언한다.
    lateinit var loginBinding : LoginActBinding
    private val loginVM : LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginBinding = DataBindingUtil.setContentView(this, R.layout.login_act)
        loginBinding.vm = loginVM

        setLogoImage()


        /* ----------- */
        loginVM.onRegiterClick.observe(this, Observer { t ->
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        })
    }


    fun setLogoImage(){
        val context: Context = this
        val bitmap = BitmapFactory.decodeResource(context.resources, R.drawable.logo_kofpy)
        val imageView : ImageView = loginBinding.logoLogin
        imageView.setImageBitmap(bitmap)
    }
    /* TODO : Login Flow 구현 by Kotlin
    *   UserRepo --> Login & Registrarion */

}