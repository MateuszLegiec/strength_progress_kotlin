package com.strengthprogress.repositories

import com.strengthprogress.domain.Role
import org.springframework.data.jpa.repository.JpaRepository

interface RoleRepository: JpaRepository<Role,Long> {}