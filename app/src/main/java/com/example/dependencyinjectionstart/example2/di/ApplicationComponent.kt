package com.example.dependencyinjectionstart.example2.di

import android.content.Context
import com.example.dependencyinjectionstart.example2.data.database.ExampleDatabase
import com.example.dependencyinjectionstart.example2.data.network.ExampleApiService
import com.example.dependencyinjectionstart.example2.presentation.MainActivity
import com.example.dependencyinjectionstart.example2.presentation.MainActivitySecond
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(
    modules = [
        DataModule::class,
        DomainModule::class,
        ViewModelModule::class,
    ]
)
interface ApplicationComponent {

    fun inject(activity: MainActivity)
    fun inject(activity: MainActivitySecond)

    @Component.Factory
    interface ApplicationComponentFactory {
        fun create(
            @BindsInstance context: Context,
            @BindsInstance currentTime: Long
        ): ApplicationComponent
    }

}