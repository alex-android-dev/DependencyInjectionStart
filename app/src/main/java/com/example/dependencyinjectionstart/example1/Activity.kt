package com.example.dependencyinjectionstart.example1

import com.example.dependencyinjectionstart.example1.di.Component
import com.example.dependencyinjectionstart.example1.di.DaggerDaggerComponent
import javax.inject.Inject


class Activity {

    lateinit var computer: Computer

    /**
     * Dagger вставляет данную в инстанс с помощью такой аннотации
     * Dagger берет все поля помеченные @Inject и реализует под капотом создание класса
     */
//    @Inject
//    lateinit var keyboard: Keyboard

    /**
     * Реализация геттера в даггере
     */
    val keyboard = DaggerDaggerComponent.create().getKeyboard()
    val mouse = DaggerDaggerComponent.create().getMouse()

    @Inject
    lateinit var monitor: Monitor


    init {
        /**
         * Тут мы поставляем в класс Activity.
         * Компонент в свою очередь будет заниматься созданием инстансов и поставкой в наш класс
         */
        Component().inject(this)

        DaggerDaggerComponent.create().inject(this)
    }

}