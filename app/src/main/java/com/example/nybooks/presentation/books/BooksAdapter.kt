package com.example.nybooks.presentation.books

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nybooks.R
import com.example.nybooks.data.model.Book
import kotlinx.android.synthetic.main.item_book.view.*

class BooksAdapter(private val books: List<Book>) : RecyclerView.Adapter<BooksAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val title = itemView.textTitle
        private val author = itemView.textAuthor

        fun bindView(book: Book){
            title.text = book.title
            author.text = book.author
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewInflater = LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)
        return ViewHolder(viewInflater)
    }

    override fun getItemCount() = books.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(books[position])
    }

}