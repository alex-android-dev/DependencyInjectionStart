package com.example.dependencyinjectionstart.example1


/**
 * Создаём компонент, чтобы класс Activity не вбирал в себя эту кучу кода
 * И не создавал все инстансы внутри себя
 */

class Component {

    /**
     * Поставляем класс Computer через создание инстансов
     * Данный способ работает не так хорошо, поскольку класс также продолжает заниматься созданием инстансов объектов
     */
    private fun getComputer(): Computer {
        val monitor = Monitor()
        val keyboard = Keyboard()
        val mouse = Mouse()

        val computerTower = ComputerTower(
            Storage(),
            Memory(),
            Processor()
        )

        return Computer(monitor, computerTower, keyboard, mouse)
    }


    /**
     * Суть в том, что мы внутрь класса поставляем инстансы объекта
     * То есть сама активити не занимается созданием инстансов
     * Они приходят из "вне", т.е. из класса Component
     */
    fun inject(activity: Activity) {
        activity.computer = getComputer()
        activity.keyboard = Keyboard()
    }


}