package org.example.capturegongolatagkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform