package com.snd.foresttest.base

import android.util.Log
import androidx.lifecycle.ViewModel

// 코틀린은 상속금지가 기본이므로 open 키워드를 명시해야 한다.
open class TMViewModel : ViewModel() {
    private val TAG = javaClass.simpleName


    fun log(msg : String){
        Log.d(TAG, msg)
    }

}