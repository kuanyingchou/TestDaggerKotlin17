package com.example.lib;

import javax.inject.Inject;

class Car @Inject constructor(val engine: Engine) {
    fun run() {
        println("running!")
    }
}

class Engine @Inject constructor()
