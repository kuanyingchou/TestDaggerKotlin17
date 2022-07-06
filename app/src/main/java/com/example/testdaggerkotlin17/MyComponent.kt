package com.example.testdaggerkotlin17;

import com.example.lib.Car
import dagger.Component;

@Component
interface MyComponent {
    val car: Car
}

