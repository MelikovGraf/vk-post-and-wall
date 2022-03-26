@file:Suppress("NAME_SHADOWING")

object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {

        val post = post.copy(id = generationId())
        posts += post
        return posts.last()
    }

    fun update(post: Post): Boolean {
        val postId = post.component1()
        val post1 = post
        for ((index, post) in posts.withIndex()) {
            if (post.id == postId) {
                posts[index] = post.copy(
                    fromId = post1.fromId,
                    createdBy = post1.createdBy,
                    text = post1.text,
                    replyOwnerId = post1.replyOwnerId,
                    replyPostId = post1.replyPostId,
                    friendsOnly = post1.friendsOnly,
                    comments = post1.comments,
                    copyright = post1.copyright,
                    likes = post1.likes,
                    reposts = post1.reposts,
                    views = post1.views,
                    postType = post1.postType,
                    signerId = post1.signerId,
                    canPin = post1.canPin,
                    canDelete = post1.canDelete,
                    canEdit = post1.canEdit,
                    isPinned = post1.isPinned,
                    markedAsAds = post1.markedAsAds,
                    isFavorite = post1.isFavorite,
                    postponedId = post1.postponedId
                )
                return true
            }
        }
        return false

    }

    private var memoryIdPost: Int = 1

    private fun generationId(): Int {
        memoryIdPost += 1
        return memoryIdPost - 1
    }

    fun clearArr() {

        posts = emptyArray()
        memoryIdPost = 1
    }
}