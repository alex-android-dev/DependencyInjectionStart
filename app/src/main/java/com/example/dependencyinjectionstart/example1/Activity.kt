package com.example.dependencyinjectionstart.example1

class Activity {

    val component = Component()

    val computer = component.getComputer()

}