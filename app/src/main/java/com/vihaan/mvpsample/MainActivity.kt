package com.vihaan.mvpsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.vihaan.mvpsample.models.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test()
    }


    fun test(){
        var user = User("vihaan", "verma")
        println(user)
    }
}

