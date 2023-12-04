package com.example.activity7database

import android.app.Application
import com.example.activity7database.Repository.ContainerApp
import com.example.activity7database.Repository.ContainerDataApp

class AplikasiSiswa : Application() {
    lateinit var container: ContainerApp

    override fun onCreate(){
        super.onCreate()
        container = ContainerDataApp(this)
    }
}