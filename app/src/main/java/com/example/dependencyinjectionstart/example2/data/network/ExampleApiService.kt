package com.example.dependencyinjectionstart.example2.data.network

import android.util.Log
import com.example.dependencyinjectionstart.example2.data.database.ExampleDatabase
import com.example.dependencyinjectionstart.example2.data.database.ExampleDatabase.Companion
import com.example.dependencyinjectionstart.example2.di.ApplicationScope
import javax.inject.Inject

class ExampleApiService @Inject constructor(
    private val currentTime: Long,
) {

    fun method() {
        Log.d(LOG_TAG, "ExampleApiService")
        Log.d(LOG_TAG, "current time: $currentTime")
        Log.d(LOG_TAG, "ExampleAPI: $this")
    }

    companion object {
        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
