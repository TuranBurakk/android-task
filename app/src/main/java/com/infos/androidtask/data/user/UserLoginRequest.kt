package com.infos.androidtask.data.user

import com.google.gson.annotations.SerializedName

data class UserLoginRequest (
    @SerializedName("username")
    var username: String,
    
    @SerializedName("password")
    var password: String
)