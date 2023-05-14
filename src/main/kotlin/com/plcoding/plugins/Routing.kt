package com.plcoding.plugins

import com.plcoding.routes.moodleRequest
import com.plcoding.routes.specificTeam
import io.ktor.server.routing.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*

fun Application.configureRouting() {

    routing {
        specificTeam()
        moodleRequest()
        // Static plugin. Try to access `/static/index.html`
        static{
            resources("static")
        }
    }
}
