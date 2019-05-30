package com.strengthprogress.domain

import java.util.*
import javax.persistence.*
import kotlin.collections.ArrayList

@Entity
class Training(
        val date: Date,

        @ManyToOne
        var user: User

) {

    @Id
    @GeneratedValue
    var id:Long = 0

    @OneToMany
    val exercises: List<Exercise> = ArrayList()

}