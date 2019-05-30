package com.strengthprogress.domain

import javax.persistence.*
import kotlin.collections.ArrayList

@Entity
class Exercise(

        val name: String = "",

        @ManyToOne
        var training: Training ,

        @OneToMany
        val series: List<Series> = ArrayList()
){

    @Id
    @GeneratedValue
    var id: Long = 0

}