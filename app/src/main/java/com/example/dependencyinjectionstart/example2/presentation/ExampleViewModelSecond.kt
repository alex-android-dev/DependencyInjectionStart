package com.example.dependencyinjectionstart.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.dependencyinjectionstart.example2.di.IdQualifier
import com.example.dependencyinjectionstart.example2.di.NameQualifier
import com.example.dependencyinjectionstart.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleViewModelSecond @Inject constructor(
    private val repository: ExampleRepository,
    @IdQualifier private val id: String,
    @NameQualifier private val name: String,
) : ViewModel() {

    fun method() {
        repository.method()
        Log.d("ViewModel",
            "ExampleViewModelSecond created with linkname: $this | id: $id | name: $name")
    }
}
