package com.example.dependencyinjectionstart.example2.data.repository

import com.example.dependencyinjectionstart.example2.data.datasource.local.ExampleLocalDataSource
import com.example.dependencyinjectionstart.example2.data.datasource.remote.ExampleRemoteDataSource
import com.example.dependencyinjectionstart.example2.data.mapper.ExampleMapper
import com.example.dependencyinjectionstart.example2.di.ExampleRemoteDatabaseQualifier
import com.example.dependencyinjectionstart.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    @ExampleRemoteDatabaseQualifier private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
) : ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }

}