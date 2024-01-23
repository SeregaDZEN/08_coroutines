package ru.netology.coroutines.dto

data class PostWithAuthorName(
    val post: Post,
    val authors: List<AuthorName>
)