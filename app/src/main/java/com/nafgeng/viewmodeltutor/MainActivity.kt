package com.nafgeng.viewmodeltutor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var angka = 0
        var viewModel =  ViewModelProvider(this).get(MyViewModel::class.java)

        button = findViewById(R.id.btn_tambah)
        textView = findViewById(R.id.tv_angka)

        textView.text = viewModel.angka.toString()

        button.setOnClickListener {
            viewModel.tambahAngka()
            textView.text = viewModel.angka.toString()
        }
    }
}