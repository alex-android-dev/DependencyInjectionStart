package com.example.dependencyinjectionstart.example2.data.network

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ExampleApiService @Inject constructor(
    private val currentTime: Long,
) {

    fun method() {
        Log.d(LOG_TAG, "ExampleApiService")
        Log.d(LOG_TAG, "current time: $currentTime")
    }

    companion object {
        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
