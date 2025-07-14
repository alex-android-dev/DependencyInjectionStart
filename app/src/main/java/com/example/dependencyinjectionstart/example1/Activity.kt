package com.example.dependencyinjectionstart.example1


class Activity {

    lateinit var computer: Computer
    lateinit var keyboard: Keyboard

    /**
     * Тут мы поставляем в класс Activity.
     * Компонент в свою очередь будет заниматься созданием инстансов и поставкой в наш класс
     */
    init {
        Component().inject(this)
    }

}