package com.snd.foresttest.ui.user.register

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.snd.foresttest.R
import com.snd.foresttest.base.TMActivity
import com.snd.foresttest.databinding.RegisterActBinding

class RegisterActivity : TMActivity() {

    lateinit var registerBinding : RegisterActBinding
    private val registerVM : RegisterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        registerBinding = DataBindingUtil.setContentView(this, R.layout.register_act)
        registerBinding.vm = registerVM
    }

}