package com.example.lib;

import javax.inject.Inject

class Car @Inject constructor(val engine: Engine) {
    fun start() {
        engine.start()
    }
}

class Engine @Inject constructor() {
    fun start() {
        println("engine started!")
    }
}
