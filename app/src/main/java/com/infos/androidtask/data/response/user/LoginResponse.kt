package com.infos.androidtask.data.response.user

data class LoginResponse(
    val apiVersion: String,
    val oauth: Oauth,
    val permissions: List<String>,
    val showPasswordPrompt: Boolean,
    val userInfo: UserInfo
)