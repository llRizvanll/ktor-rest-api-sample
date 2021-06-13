package com.ktorsample

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.ktorsample.plugins.*
import com.ktorsample.routing.registerCustomerRoutes
import com.ktorsample.routing.registerOrderRoutes
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.serialization.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)


fun Application.module(testing: Boolean = false) {
    install(ContentNegotiation) {
        json()
    }
    registerCustomerRoutes()
    registerOrderRoutes()
}
