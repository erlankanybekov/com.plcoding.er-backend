package com.plcoding.routes

import com.plcoding.data.model.Image
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private const val BASE_URL = "http://127.0.0.1:8125"
val imges = listOf(
    Image("chef1","from deliceiux","$BASE_URL/img/chef-1.jpg"),
    Image("chef2","from deliceiux","$BASE_URL/img/chef-2.jpg"),
    Image("chef3","from deliceiux","$BASE_URL/img/chef-3.jpg"),
    Image("chef4","from deliceiux","$BASE_URL/img/chef-4.jpg"),
    Image("hero1","hehehe ;)","$BASE_URL/img/hero_1.jpg"),
    Image("hero2","u have to work hard","$BASE_URL/img/hero_2.jpg"),

)

fun Route.randImg(){
    get("/myrandomimage"){
        call.respond(
            HttpStatusCode.OK,
            imges.random()
        )
    }
}