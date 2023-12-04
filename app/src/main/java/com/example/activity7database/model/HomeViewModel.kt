package com.example.activity7database.model

import androidx.lifecycle.ViewModel
import com.example.activity7database.Repository.RepositorySiswa

class HomeViewModel(private val repositorySiswa: RepositorySiswa): ViewModel(){

    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }
}