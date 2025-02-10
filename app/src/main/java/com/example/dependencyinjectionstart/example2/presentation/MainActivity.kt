package com.example.dependencyinjectionstart.example2.presentation

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.dependencyinjectionstart.R
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
            .activityComponentFactory()
            .create("ID")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        daggerComponent.inject(this)

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        viewModel.method()
        viewModelSecond.method()

        findViewById<TextView>(R.id.tv_hello_world).setOnClickListener {
            Intent(this, MainActivitySecond::class.java).apply {
                startActivity(this)
            }
        }

    }

}