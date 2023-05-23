package com.staytonight.data.di

import com.staytonight.data.network.Api
import com.staytonight.data.repository.NewsRepositoryImpl
import com.staytonight.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideNewsRepository(api: Api): NewsRepository = NewsRepositoryImpl(api)
}