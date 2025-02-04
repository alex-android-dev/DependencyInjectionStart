package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {

    val keyboard: Keyboard = DaggerHiltComponent.create().getKeyboard()

    @Inject
    lateinit var mouse: Mouse

    @Inject
    lateinit var monitor: Monitor

    init {
        DaggerHiltComponent.create().inject(activity = this)
    }


}