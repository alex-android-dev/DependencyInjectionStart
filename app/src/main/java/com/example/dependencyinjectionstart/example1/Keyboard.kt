package com.example.dependencyinjectionstart.example1

import javax.inject.Inject


/**
 * Если какому-то компоненту нужны данные о класса, то Dagger 2 создаст его вызвав конструктор
 */
class Keyboard @Inject constructor() {
}