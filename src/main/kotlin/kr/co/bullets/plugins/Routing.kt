package kr.co.bullets.plugins

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import kr.co.bullets.routes.root

fun Application.configureRouting() {
    routing {
//        get("/") {
//            call.respondText("Hello World!")
//        }
        root()
    }
}
