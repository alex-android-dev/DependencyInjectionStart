package com.example.dependencyinjectionstart.example2.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dependencyinjectionstart.R
import com.example.dependencyinjectionstart.example1.Activity
import com.example.dependencyinjectionstart.example1.DaggerHiltComponent
import com.example.dependencyinjectionstart.example1.HiltComponent
import com.example.dependencyinjectionstart.example2.di.ApplicationComponent
import com.example.dependencyinjectionstart.example2.di.DaggerApplicationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private val daggerComponent by lazy {
        DaggerApplicationComponent.factory().create(this, System.currentTimeMillis())
    }

    @Inject
    lateinit var viewModel: ExampleViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activity = Activity()
        activity.computer

        daggerComponent.inject(this)
        viewModel.method()
    }

}