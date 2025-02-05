package com.example.dependencyinjectionstart.example2.data.database

import android.content.Context
import android.util.Log
import com.example.dependencyinjectionstart.R
import javax.inject.Inject

class ExampleDatabase @Inject constructor(
    private val context : Context
) {

    fun method() {
        Log.d(LOG_TAG, "ExampleDatabase")
        val appName = context.getString(R.string.app_name)
        Log.d(LOG_TAG, "app name: $appName")
    }

    companion object {
        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
