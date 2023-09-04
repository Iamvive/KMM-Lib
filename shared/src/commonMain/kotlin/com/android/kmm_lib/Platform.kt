package com.android.kmm_lib

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform