package com.nashwa.latihan_5

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class genap : AppCompatActivity() {
    private lateinit var tebak : EditText
    private lateinit var btninput : Button
    private lateinit var txtgenap : TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_genap)


        tebak = findViewById(R.id.tebak)
        btninput = findViewById(R.id.btninput)
        txtgenap = findViewById(R.id.txtgenap)

        btninput.setOnClickListener(){

            val angka = tebak.text.toString().toInt()
            val runn = if (angka % 2 == 0){
                "$angka adalah bilangan genap"
            } else {
                "$angka adalah bilangan ganjil"
            }
            txtgenap.text = runn
        }


        }
    }
