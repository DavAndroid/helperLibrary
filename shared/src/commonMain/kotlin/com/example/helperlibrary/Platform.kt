package com.example.helperlibrary

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform