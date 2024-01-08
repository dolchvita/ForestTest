package com.snd.foresttest.dto.user

import java.time.LocalDateTime

data class UserDTO(
    var id : String = "",
    var password : String = "",
    var name : String = "",
    var company : String? = null,
    var position : String? = null,
    var phone : String = "",
    var email : String = "",
    var inserted : LocalDateTime? = null,
    var certification : Boolean = false,
    var roles : List<String> = listOf(""),
    var lastLogin : LocalDateTime? = null
)