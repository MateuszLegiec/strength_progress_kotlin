package com.strengthprogress.repositories

import com.strengthprogress.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<User,Long>{

    fun findByUsername(username: String): User?

    fun findByEmail(email: String): User?

    override fun deleteById(id: Long)

}