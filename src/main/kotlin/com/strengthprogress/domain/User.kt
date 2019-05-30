package com.strengthprogress.domain

import java.util.*
import javax.persistence.*

@Entity
open class User(
        var userName: String = "",
        var email: String = "",
        var passWord: String = "",
        var dateOfBirth: Date,
        var bodyWeight: Double,
        var gender: Gender){

    @Id
    @GeneratedValue
    var id: Long = 0
    var version: Int = 0
    var accountNonExpired: Boolean = true
    var accountNonLocked: Boolean = true
    var credentialsNonExpired: Boolean = true
    var enabled: Boolean = true
    @OneToMany(fetch = FetchType.EAGER, cascade = arrayOf(CascadeType.ALL))
    var roles: Set<Role> = HashSet()

    constructor(user: User) : this(user.userName, user.email, user.passWord, user.dateOfBirth, user.bodyWeight, user.gender) {
        id = user.id
        version = user.version
        email = user.email
        dateOfBirth = user.dateOfBirth
        bodyWeight = user.bodyWeight
        gender = user.gender
        accountNonExpired = user.accountNonExpired
        accountNonLocked = user.accountNonLocked
        credentialsNonExpired = user.credentialsNonExpired
        enabled = user.enabled
        roles = user.roles
    }
}