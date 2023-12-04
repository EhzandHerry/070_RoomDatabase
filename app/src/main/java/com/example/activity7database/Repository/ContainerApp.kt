package com.example.activity7database.Repository

import android.content.Context
import com.example.activity7database.data.DatabaseSiswa

interface ContainerApp {
    val repositorySiswa: RepositorySiswa
}

class ContainerDataApp(private val context: Context) : ContainerApp{
    override val repositorySiswa: RepositorySiswa by lazy {
        OfflineRepositorySiswa(DatabaseSiswa.getDatabase(context).siswaDao())
    }
}