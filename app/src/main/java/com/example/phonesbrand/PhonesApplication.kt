package com.example.phonesbrand

import android.app.Application
import com.example.phonesbrand.DependencContainer


class PhonesApplication : Application() {
    val dependencContainer = DependencContainer()
}