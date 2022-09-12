package com.nafgeng.viewmodeltutor

import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    var angka = 0

    fun tambahAngka() {
        angka++
    }
}