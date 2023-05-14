package com.plcoding.routes

import com.plcoding.data.model.Team
import com.plcoding.data.model.teamDescriptions
import com.plcoding.data.model.teamNames
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private const val BASE_URL = "http://192.168.1.6:8080"

private val teams = listOf(
    Team(teamNames[0], teamDescriptions[0],"$BASE_URL/football_teams/FC_Barcelona.png"),
    Team(teamNames[1], teamDescriptions[1],"$BASE_URL/football_teams/Atletico_Madrid.png"),
    Team(teamNames[2], teamDescriptions[2],"$BASE_URL/football_teams/Real_Madrid.png"),
    Team(teamNames[3], teamDescriptions[3],"$BASE_URL/football_teams/Real_Sociedad.png"),
    Team(teamNames[4], teamDescriptions[4],"$BASE_URL/football_teams/Villarreal_FC.png"),
    Team(teamNames[5], teamDescriptions[5],"$BASE_URL/football_teams/Betis_Sevilla.png"),
    Team(teamNames[6], teamDescriptions[6],"$BASE_URL/football_teams/Girona.png"),
    Team(teamNames[7], teamDescriptions[7],"$BASE_URL/football_teams/Athletic_Club_Bilbao.png"),
    Team(teamNames[8], teamDescriptions[8],"$BASE_URL/football_teams/Rayovallecano.png"),
    Team(teamNames[9], teamDescriptions[9],"$BASE_URL/football_teams/Osasuna.png"),
    Team(teamNames[10], teamDescriptions[10],"$BASE_URL/football_teams/FC_Sevilla.png"),
    Team(teamNames[11], teamDescriptions[11],"$BASE_URL/football_teams/Rcd_mallorca.png"),
    Team(teamNames[12], teamDescriptions[12],"$BASE_URL/football_teams/Celta_Vigo.png"),
    Team(teamNames[13], teamDescriptions[13],"$BASE_URL/football_teams/UDAlmeria.png"),
    Team(teamNames[14], teamDescriptions[14],"$BASE_URL/football_teams/Cádiz_CF.png"),
    Team(teamNames[15], teamDescriptions[15],"$BASE_URL/football_teams/Valladolid.png"),
    Team(teamNames[16], teamDescriptions[16],"$BASE_URL/football_teams/Valencia_Cf.png"),
    Team(teamNames[17], teamDescriptions[17],"$BASE_URL/football_teams/Getafe.png"),
    Team(teamNames[18], teamDescriptions[18],"$BASE_URL/football_teams/Espanyol.png"),
    Team(teamNames[19], teamDescriptions[19],"$BASE_URL/football_teams/Elche_CF.png"),
    )

fun Route.specificTeam(){
    get("specificteam/{teamIndex}"){
        call.respond(
            HttpStatusCode.OK,
            teams[(call.parameters["teamIndex"]?.toIntOrNull()?:1) - 1]
        )
    }
}

fun Route.moodleRequest(){
    get("is-11fiot-21-114"){
        call.respond(
            HttpStatusCode.OK,
            "Прізвище: Камчатний\nІм'я: Владислав\nКурс: 2\nГрупа: ІС-11"
        )
    }
}