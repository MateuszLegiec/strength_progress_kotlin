package com.strengthprogress.repositories

import com.strengthprogress.domain.Exercise
import org.springframework.data.jpa.repository.JpaRepository

interface ExerciseRepository:JpaRepository<Exercise,Long>{

    fun findByNameAndTrainingUserId(name: String, userId: Long)

}