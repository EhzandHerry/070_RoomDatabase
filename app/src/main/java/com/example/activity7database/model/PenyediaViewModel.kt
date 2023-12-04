package com.example.activity7database.model

import android.text.Spannable.Factory
import android.app.Application
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.activity7database.AplikasiSiswa

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(AplikasiSiswa().container.repositorySiswa)
        }
        initializer {
            EntryViewModel(AplikasiSiswa().container.repositorySiswa)
        }
    }
}

fun CreationExtras.aplikasiSiswa():AplikasiSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa)