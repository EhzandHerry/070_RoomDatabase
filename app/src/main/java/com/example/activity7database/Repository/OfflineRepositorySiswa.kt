package com.example.activity7database.Repository

import com.example.activity7database.data.Siswa
import com.example.activity7database.data.SiswaDao
import kotlinx.coroutines.flow.Flow

class OfflineRepositorySiswa (private val siswaDao: SiswaDao) : RepositorySiswa{
    override fun getAllSiswaStream(): Flow<List<Siswa>> = siswaDao.getAllSiswa()

    override fun getSiswaStream(id: Int): Flow<Siswa?> {
        TODO("Not yet implemented")
    }

    override suspend fun insertSiswa(siswa: Siswa) = siswaDao.insert(siswa)

    override suspend fun deleteSiswa(siswa: Siswa) = siswaDao.delete(siswa)

    override suspend fun updateSiswa(siswa: Siswa) {
        TODO("Not yet implemented")
    }
}


