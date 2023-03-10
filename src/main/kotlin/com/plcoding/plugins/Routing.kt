package com.plcoding.plugins

import com.plcoding.routes.imges
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    routing {
        get("/") {
            call.respond(
                HttpStatusCode.OK,
                imges.random()
            )
        }

        // Static plugin. Try to access `/static/index.html`
        static{
            resources("static")
        }
    }
}
