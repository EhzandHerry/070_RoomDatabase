package com.example.activity7database.navigasi

interface DestinasiNavigasi {
    /**
     * Nama unik untuk menentukan jalur untuk composabel
     */
    val route: String

    /**
     * String resource id yang berisi judul yang akan ditampilkan dilayar halaman
     */
    val titleRes: Int
}