package com.example.dependencyinjectionstart.example1

import dagger.Component

@Component
interface HiltComponent {

    fun getKeyboard() : Keyboard

    fun inject(activity: Activity)

}