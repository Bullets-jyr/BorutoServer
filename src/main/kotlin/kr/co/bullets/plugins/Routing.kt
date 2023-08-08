package kr.co.bullets.plugins

import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*
import kr.co.bullets.routes.getAllHeroes
import kr.co.bullets.routes.root

fun Application.configureRouting() {
    routing {
//        get("/") {
//            call.respondText("Hello World!")
//        }
        root()
        getAllHeroes()

        static("/images") {
            resources("images")
        }
    }
}
