package com.example.activity7database.model

import androidx.lifecycle.ViewModel
import com.example.activity7database.Repository.RepositorySiswa
import com.example.activity7database.data.Siswa
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.filterNotNull

class HomeViewModel(private val repositorySiswa: RepositorySiswa): ViewModel(){

    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }

    data class HomeUiState(
        val listSiswa: List<Siswa> = listOf()
    )
}