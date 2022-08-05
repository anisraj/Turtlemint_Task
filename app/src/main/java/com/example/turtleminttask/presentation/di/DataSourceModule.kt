package com.example.turtleminttask.presentation.di

import com.example.turtleminttask.data.api.ApiService
import com.example.turtleminttask.data.repository.RemoteDataSource
import com.example.turtleminttask.data.repository.RemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {

    @Singleton
    @Provides
    fun providesRemoteDataSource(apiService: ApiService): RemoteDataSource {
        return RemoteDataSourceImpl(apiService)
    }
}