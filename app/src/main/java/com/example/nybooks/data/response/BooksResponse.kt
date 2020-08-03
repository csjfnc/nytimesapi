package com.example.nybooks.data.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BooksResponse(
    @Json(name = "results")
    val booksResultResponse: List<BooksResultResponse>
) {
}