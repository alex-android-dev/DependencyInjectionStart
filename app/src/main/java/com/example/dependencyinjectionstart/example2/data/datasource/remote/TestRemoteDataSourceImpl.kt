package com.example.dependencyinjectionstart.example2.data.datasource.remote

import android.util.Log
import javax.inject.Inject

class TestRemoteDataSourceImpl @Inject constructor() : ExampleRemoteDataSource {

    override fun method() {
        Log.d(LOG_TAG, "TestRemoteDataSourceImpl created: $this")
    }

    companion object {
        private const val LOG_TAG = "EXAMPLE_TEST"
    }

}
