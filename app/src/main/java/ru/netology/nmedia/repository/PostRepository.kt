package ru.netology.nmedia.repository


import kotlinx.coroutines.flow.Flow
import ru.netology.nmedia.dto.Post
import java.io.File

interface PostRepository {
    val data: Flow<List<Post>>

    fun getNewerCount(id: Long): Flow<Int>
    suspend fun showNewPosts()
    suspend fun getAll()
    suspend fun save(post: Post)
    suspend fun removeById(id: Long)
    suspend fun saveWithAttachment(post: Post, file: File)
    suspend fun likeById(id: Long)

    suspend fun dislikeById(id: Long)
}
