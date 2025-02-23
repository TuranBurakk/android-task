package com.infos.androidtask.data.local

import com.infos.androidtask.data.response.TaskData
import javax.inject.Inject

class LocalDataSource @Inject constructor(
    private val taskDao: TaskDao
) {
    fun getLocal(): List<TaskData>{
        return taskDao.getLocal()
    }

    suspend fun saveData(model: List<TaskData>){
        taskDao.saveDao(model)
    }
}