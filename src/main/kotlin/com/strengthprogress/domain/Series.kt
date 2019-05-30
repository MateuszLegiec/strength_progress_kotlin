package com.strengthprogress.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Series(var weight:Double,
             var reps:Int){
    @Id
    @GeneratedValue
    @ManyToOne
    var id:Long = 0

    fun getVolume():Double{ return weight*reps}


    fun getOneRepMax(): Double {

        val weightMultiplication = when(reps){
            1 -> 1.00
            2 -> 1.05
            3 -> 1.08
            4 -> 1.11
            5 -> 1.15
            6 -> 1.18
            7 -> 1.20
            8 -> 1.25
            9 -> 1.30
            10 -> 1.33
            11 -> 1.43
            12 -> 1.49
            13 -> 1.51
            14 -> 1.52
            15 -> 1.54
            else -> 0.0
        }

        return weight * weightMultiplication
    }

}