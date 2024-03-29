package ru.netology.coroutines.dto

data class AuthorName(
    val authorId: Long,
    val id: Long,
    val author: String,
    val authorAvatar: String,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,
)


