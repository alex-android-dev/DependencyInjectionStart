package com.example.dependencyinjectionstart.example2.di

import androidx.lifecycle.ViewModel
import com.example.dependencyinjectionstart.example2.presentation.ExampleViewModel
import com.example.dependencyinjectionstart.example2.presentation.ExampleViewModelSecond
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
interface ViewModelModule {

    @IntoMap
    @ViewModelKey(ExampleViewModel::class)
    @Binds
    fun bindExampleViewModel(viewModel: ExampleViewModel): ViewModel

    @IntoMap
    @ViewModelKey(ExampleViewModelSecond::class)
    @Binds
    fun bindExampleViewModelSecond(viewModel: ExampleViewModelSecond): ViewModel

}