package kr.co.bullets.plugins

import io.ktor.server.application.*
import kr.co.bullets.di.koinModule
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger

fun Application.configureKoin() {
    install(Koin) {
        slf4jLogger()
        modules(koinModule)
    }
}