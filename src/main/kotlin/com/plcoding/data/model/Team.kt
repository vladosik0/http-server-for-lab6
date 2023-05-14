package com.plcoding.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Team(
    val name: String,
    val description: String,
    val imageUrl: String
)

val teamNames = listOf(
    "Barcelona",
    "Atletico Madrid",
    "Real Madrid",
    "Real Sociedad",
    "Villarreal",
    "Real Betis",
    "Girona",
    "Athletic Bilbao",
    "Rayo Vallecano",
    "Osasuna",
    "Sevilla",
    "Real Mallorca",
    "Celta Vigo",
    "Almeria",
    "Cadiz",
    "Real Valladolid",
    "Valencia",
    "Getafe",
    "Espanyol",
    "Elche"
)
val teamDescriptions = listOf(
    "Games played: 33\nPosition: 1\nGoals scored: 60\nGoals conceded: 11\nPoints: 82",
    "Games played: 33\nPosition: 2\nGoals scored: 60\nGoals conceded: 26\nPoints: 69",
    "Games played: 33\nPosition: 3\nGoals scored: 69\nGoals conceded: 32\nPoints: 68",
    "Games played: 33\nPosition: 4\nGoals scored: 43\nGoals conceded: 29\nPoints: 61",
    "Games played: 33\nPosition: 5\nGoals scored: 47\nGoals conceded: 34\nPoints: 54",
    "Games played: 33\nPosition: 6\nGoals scored: 40\nGoals conceded: 37\nPoints: 52",
    "Games played: 33\nPosition: 7\nGoals scored: 52\nGoals conceded: 46\nPoints: 47",
    "Games played: 33\nPosition: 8\nGoals scored: 43\nGoals conceded: 33\nPoints: 47",
    "Games played: 33\nPosition: 9\nGoals scored: 40\nGoals conceded: 42\nPoints: 46",
    "Games played: 33\nPosition: 10\nGoals scored: 29\nGoals conceded: 35\nPoints: 44",
    "Games played: 33\nPosition: 11\nGoals scored: 41\nGoals conceded: 49\nPoints: 44",
    "Games played: 33\nPosition: 12\nGoals scored: 32\nGoals conceded: 37\nPoints: 41",
    "Games played: 33\nPosition: 13\nGoals scored: 38\nGoals conceded: 46\nPoints: 39",
    "Games played: 33\nPosition: 14\nGoals scored: 42\nGoals conceded: 58\nPoints: 36",
    "Games played: 33\nPosition: 15\nGoals scored: 26\nGoals conceded: 49\nPoints: 35",
    "Games played: 33\nPosition: 16\nGoals scored: 30\nGoals conceded: 57\nPoints: 35",
    "Games played: 33\nPosition: 17\nGoals scored: 36\nGoals conceded: 40\nPoints: 34",
    "Games played: 33\nPosition: 18\nGoals scored: 30\nGoals conceded: 42\nPoints: 34",
    "Games played: 33\nPosition: 19\nGoals scored: 40\nGoals conceded: 56\nPoints: 31",
    "Games played: 33\nPosition: 20\nGoals scored: 25\nGoals conceded: 64\nPoints: 16"

)