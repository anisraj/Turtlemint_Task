package com.example.turtleminttask.presentation.di

import com.example.turtleminttask.data.repository.RemoteDataSource
import com.example.turtleminttask.data.repository.RemoteRepository
import com.example.turtleminttask.data.repository.RemoteRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RepositoryModule {
    @Singleton
    @Provides
    fun providesRepository(
        remoteDataSource: RemoteDataSource
    ): RemoteRepository {
        return RemoteRepositoryImpl(remoteDataSource)
    }
}