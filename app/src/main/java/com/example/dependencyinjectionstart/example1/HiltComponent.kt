package com.example.dependencyinjectionstart.example1

import dagger.Component

@Component(modules = [ComputerModule::class])
interface HiltComponent {

    fun inject(activity: Activity)

}