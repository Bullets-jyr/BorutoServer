package kr.co.bullets

import io.ktor.application.*
import kr.co.bullets.plugins.configureMonitoring
import kr.co.bullets.plugins.configureRouting
import kr.co.bullets.plugins.configureSerialization

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureSerialization()
    configureMonitoring()
    configureRouting()
}
