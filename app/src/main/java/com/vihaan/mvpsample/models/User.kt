package com.vihaan.mvpsample.models

/**
 * Created by vihaanverma on 17/12/17.
 */

class  User(firstName: String, lastName:String)
{

    val fullName = firstName+lastName;

    init {
        println("full name " + fullName);
    }
    val marathiName = lastName+firstName;

    init {
        println("marathi name " + marathiName);
    }

}