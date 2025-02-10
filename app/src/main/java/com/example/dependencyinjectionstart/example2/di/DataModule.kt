package com.example.dependencyinjectionstart.example2.di

import com.example.dependencyinjectionstart.example2.data.datasource.local.ExampleLocalDataSource
import com.example.dependencyinjectionstart.example2.data.datasource.local.ExampleLocalDataSourceImpl
import com.example.dependencyinjectionstart.example2.data.datasource.remote.ExampleRemoteDataSource
import com.example.dependencyinjectionstart.example2.data.datasource.remote.ExampleRemoteDataSourceImpl
import com.example.dependencyinjectionstart.example2.data.datasource.remote.TestRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindExampleLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ApplicationScope
    @Binds
    @ExampleRemoteDatabaseQualifier
    fun bindExampleRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @ApplicationScope
    @Binds
    @TestRemoteDatabaseQualifier
    fun bindTestRemoteDataSource(impl: TestRemoteDataSourceImpl): ExampleRemoteDataSource

}