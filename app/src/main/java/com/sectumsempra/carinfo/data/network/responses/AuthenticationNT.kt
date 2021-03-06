package com.sectumsempra.carinfo.data.network.responses

import com.sectumsempra.carinfo.domain.entity.AuthResult
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal class AuthenticationNT(
    @Json(name = "name")
    val name: String,
    @Json(name = "token")
    val token: String
)

internal val AuthenticationNT.asDomainEntity get() = AuthResult(name, token)