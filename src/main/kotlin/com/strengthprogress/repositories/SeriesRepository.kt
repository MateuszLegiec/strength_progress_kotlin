package com.strengthprogress.repositories

import com.strengthprogress.domain.Series
import org.springframework.data.jpa.repository.JpaRepository

interface SeriesRepository:JpaRepository<Series,Long>