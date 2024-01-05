package com.snd.foresttest.base

import android.util.Log
import androidx.appcompat.app.AppCompatActivity

open class TMActivity : AppCompatActivity() {
    private val TAG = javaClass.simpleName


    fun log(msg : String){
        Log.d(TAG, msg)
    }

}