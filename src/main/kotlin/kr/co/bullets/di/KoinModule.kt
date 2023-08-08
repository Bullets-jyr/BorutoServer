package kr.co.bullets.di

import kr.co.bullets.repository.HeroRepository
import kr.co.bullets.repository.HeroRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
}