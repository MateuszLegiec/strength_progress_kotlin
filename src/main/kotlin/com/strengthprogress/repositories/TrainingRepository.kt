package com.strengthprogress.repositories

import com.strengthprogress.domain.Training
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import java.util.*

interface TrainingRepository:JpaRepository<Training,Long>{

    fun findByDateAndUserId(date: Date,userId:Long)

    @Query("select Training.date from Training where Training.user = :userId")
    fun findDatesByUserId(@Param("userId") userId: Long)

}