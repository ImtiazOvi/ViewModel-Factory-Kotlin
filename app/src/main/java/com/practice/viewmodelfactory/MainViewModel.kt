package com.practice.viewmodelfactory

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel(name: String): ViewModel() {
    var myName: String = name
    init {
        Log.d("checkViewModel","My name is ${myName}")
    }
}