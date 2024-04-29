package com.example.pehliapp.Practice

import java.util.Scanner

fun main(){
Child().abc()
}

open class Parent{
    var money = 5000
    open fun abc(){
        println("My name is parent")
    }
}
class Child:Parent(){
    override fun abc(){
        println("My Name is Child")
        super.abc()
    }
}