package com.example.dependencyinjectionstart.example2.di

import com.example.dependencyinjectionstart.example2.presentation.MainActivity
import com.example.dependencyinjectionstart.example2.presentation.MainActivitySecond
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(
    modules = [ViewModelModule::class]
)
interface ActivityComponent {

    fun inject(activity: MainActivity)
    fun inject(activity: MainActivitySecond)

    @Subcomponent.Factory
    interface Factory {

        fun create(@BindsInstance @idQualifier id: String,
                   @BindsInstance @nameQualifier name: String): ActivityComponent

    }

}