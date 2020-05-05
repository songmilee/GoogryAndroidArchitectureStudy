package com.sangjin.newproject.adapter

data class ResponseData(
    val items: List<Movie>
)

data class Movie(
    val title: String,
    val link: String,
    val image: String,
    val subtitle: String,
    val pubDate: String,
    val director: String,
    val actor: String,
    val userRating: String
)
