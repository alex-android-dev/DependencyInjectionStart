package com.example.dependencyinjectionstart.example2.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.dependencyinjectionstart.R
import com.example.dependencyinjectionstart.example1.Activity
import com.example.dependencyinjectionstart.example2.ExampleApp
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel::class.java]
    }

    private val viewModelSecond by lazy {
        ViewModelProvider(this, viewModelFactory)[ExampleViewModelSecond::class.java]
    }

    private val daggerComponent by lazy {
        (application as ExampleApp).daggerComponent
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        daggerComponent.inject(this)

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val activity = Activity()
        activity.computer

        viewModel.method()
        viewModelSecond.method()
    }

}