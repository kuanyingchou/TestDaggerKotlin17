package com.example.lib;

import dagger.Component;
import dagger.Provides;

@Component
interface MyComponent {
    val car: Car
}

