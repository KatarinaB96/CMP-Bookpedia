package com.plcoding.bookpedia

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.book.presentation.book_list.BookListScreen
import com.plcoding.bookpedia.book.presentation.book_list.BookListState
import com.plcoding.bookpedia.book.presentation.book_list.components.BookSearchBar

@Preview(backgroundColor = 0xFF000000)
@Composable
fun BookSearchBarPreview() {
    BookSearchBar(
        searchQuery = "",
        onSearchQueryChange = {},
        onImeSearch = {},
        modifier = Modifier.fillMaxWidth()
    )
}



@Preview
@Composable
private fun BookListScreenPreview() {
    BookListScreen(
        state = BookListState(searchResults = books),
        onAction = {}
    )
}

 val books = (1..100).map {
    Book(
        id = it.toString(), title = "Book $it",
        authors = listOf("Author $it"),
        imageUrl = "https://picsum.photos/200",
        description = "Description",
        languages = emptyList(),
        averageRating = 4.6725,
        firstPublishYear = null,
        numEditions = 3,
        numPages = 100,
        ratingCount = 5
    )
}