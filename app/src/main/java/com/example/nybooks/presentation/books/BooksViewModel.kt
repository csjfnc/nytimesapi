package com.example.nybooks.presentation.books

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.nybooks.data.ApiService
import com.example.nybooks.data.model.Book
import com.example.nybooks.data.response.BooksResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BooksViewModel : ViewModel() {

    val booksLiveData: MutableLiveData<List<Book>> = MutableLiveData()

    fun getBooks(){
        //booksLiveData.value = createFakeBooks()
        ApiService.service.getBooks().enqueue(object : Callback<BooksResponse> {
            override fun onFailure(call: Call<BooksResponse>, t: Throwable) {
                TODO("Not yet implemented")
            }

            override fun onResponse(call: Call<BooksResponse>, response: Response<BooksResponse>) {
                TODO("Not yet implemented")
            }
        })
    }

    fun createFakeBooks(): List<Book>{
        return listOf(
            Book(title = "Title 1", author = "Author 1"),
            Book(title = "Title 1", author = "Author 1"),
            Book(title = "Title 1", author = "Author 1"),
            Book(title = "Title 1", author = "Author 1")
        )
    }
}