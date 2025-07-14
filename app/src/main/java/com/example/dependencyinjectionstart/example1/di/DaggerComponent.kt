package com.example.dependencyinjectionstart.example1.di

import com.example.dependencyinjectionstart.example1.Activity
import com.example.dependencyinjectionstart.example1.Keyboard
import com.example.dependencyinjectionstart.example1.Monitor
import com.example.dependencyinjectionstart.example1.Mouse
import dagger.Component

/**
 * Чтобы Dagger написал сам реализацию данного интерфейса
 * Помечаем аннотацией Component
 */
@Component
interface DaggerComponent {

    fun getKeyboard(): Keyboard

    fun getMouse(): Mouse

    fun getMonitor(): Monitor

    fun inject(activity: Activity)

}