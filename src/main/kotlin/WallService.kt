@file:Suppress("NAME_SHADOWING")


object WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Post.Commentes>()

    private var memoryIdPost: Int = 1

    private fun generationId(): Int {
        memoryIdPost += 1
        return memoryIdPost - 1
    }

    fun clearArr() {
        comments = emptyArray()
        posts = emptyArray()
        memoryIdPost = 1
    }

    fun createComment(post: Post): Post.Commentes? {
        val postId = post.id
        val postComment = post.comments
        for ((index, post) in posts.withIndex())
            if (post.id == postId) {
                posts[index] = post.copy(
                    comments = postComment
                )
                return post.comments!!
            }else throw PostNotFoundException()
        return null
    }

    fun add(post: Post): Post {
        val newPost = post.copy(id = generationId())
        posts += newPost
        return posts.last()
    }

    fun update(post: Post): Boolean {
        val postId = post.id
        val oldPost = post
        for ((index, post) in posts.withIndex()) {
            if (post.id == postId) {
                posts[index] = post.copy(
                    ownerId = oldPost.ownerId,
                    date = oldPost.date,
                )
                return true
            }
        }
        return false

    }
}