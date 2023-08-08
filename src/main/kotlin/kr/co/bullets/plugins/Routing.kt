package kr.co.bullets.plugins

import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*
import kr.co.bullets.routes.getAllHeroes
import kr.co.bullets.routes.root
import kr.co.bullets.routes.searchHeroes
import javax.naming.AuthenticationException

fun Application.configureRouting() {
    routing {
//        get("/") {
//            call.respondText("Hello World!")
//        }
        root()
        getAllHeroes()
        searchHeroes()

//        get("/test2") {
//            throw AuthenticationException()
//        }

        static("/images") {
            resources("images")
        }
    }
}
