package com.example.dependencyinjectionstart.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.dependencyinjectionstart.example2.di.idQualifier
import com.example.dependencyinjectionstart.example2.di.nameQualifier
import com.example.dependencyinjectionstart.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase,
    @idQualifier private val id: String,
    @nameQualifier private val name: String,
) : ViewModel() {

    fun method() {
        useCase
        Log.d(
            "ViewModel",
            "ExampleViewModel created with linkname: $this | id: $id | name: $name"
        )
    }
}
