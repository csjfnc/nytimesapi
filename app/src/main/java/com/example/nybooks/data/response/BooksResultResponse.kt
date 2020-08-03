package com.example.nybooks.data.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class BooksResultResponse(
    @Json(name = "book_details")
    val booksDetails: List<BooksDetailsResponse>
) {
}