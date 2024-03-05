package com.dicoding.asclepius.di.feature

import com.dicoding.asclepius.data.repository.ArticleRepository
import com.dicoding.asclepius.data.source.ArticleDataSource
import org.koin.dsl.module

val articleModule = module {

    factory { ArticleRepository(get()) }

    single { ArticleDataSource(get()) }
}
