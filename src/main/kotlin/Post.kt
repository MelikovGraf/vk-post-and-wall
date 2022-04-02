enum class PostType {
    Post, Copy, Reply, Postpone, Suggest
}

data class Post(
    val id: Int?,
    val ownerId: Int?,
    val fromId: Int?,
    val createdBy: Int?,
    val date: Int?,
    val text: String?,
    val replyOwnerId: Int?,
    val replyPostId: Int?,
    val friendsOnly: Boolean? = false,
    val comments: Commentes?,
    val copyright: String?,
    val likes: Likes?,
    val reposts: Reposts?,
    val views: Views?,
    val postType: PostType?,
    val postSource: PostSource?,
    var attachments: ArrayAttachments,
    val geo: Geo?,
    val signerId: Int?,
    val copeHistory: Boolean? = false,
    val canPin: Boolean? = false,
    val canDelete: Boolean? = false,
    val canEdit: Boolean? = false,
    val isPinned: Boolean? = false,
    val markedAsAds: Boolean? = false,
    val isFavorite: Boolean? = false,
    val donut: Donut?,
    val postponedId: Int?,
) {
    data class Commentes(
        val id: Int?,
        val count: Int?,
        val canPost: Boolean? = true,
        val groupsCanPost: Boolean? = true,
        val canClose: Boolean? = true,
        val canOpen: Boolean? = true,
    )

    data class Likes(
        val count: Int?,
        val userLikes: Boolean? = false,
        val canLike: Boolean? = true,
        val canPublish: Boolean? = true,
    )

    data class Reposts(
        val count: Int?,
        val userReposted: Boolean? = false,
    )

    data class Views(
        val count: Int?,
    )

    data class PostSource(
        val type: String?,
        val platform: String?,
        val data: String?,
        val url: String?,
    )

    data class Geo(
        val type: String?,
        val coordinates: String?,
        val place: Place?
    ) {
        data class Place(
            val type: String?
        )
    }

    data class Donut(
        val isDonut: Boolean? = false,
        val paidDuration: Int?,
        val placeholder: Placeholder?,
        val canPublishFreeCopy: Boolean = false,
        val editMode: String?
    ) {
        data class Placeholder(
            val type: String?
        )
    }

    sealed class Attachments(val type: String)

    data class ArrayAttachments(
        val type: String
    ){
        data class Video(val video: Video) : Attachments("video")
        data class Audio(val audio: Audio) : Attachments("audio")
        data class Photo(val photo: Photo) : Attachments("photo")
        data class Document(val document: Document) : Attachments("document")
    }
    fun fooAttachments(att: Attachments): String = when (att) {
        is ArrayAttachments.Audio -> "audio \nid: 1, \nalbumId: 1, \nownerId: 1, \nuserId: 1"
        is ArrayAttachments.Document -> "document \nid: 1, \nalbumId: 1, \nownerId: 1, \nuserId: 1"
        is ArrayAttachments.Photo -> "photo \nid: 1, \nalbumId: 1, \nownerId: 1, \nuserId: 1"
        is ArrayAttachments.Video -> "video \nid: 1, \nalbumId: 1, \nownerId: 1, \nuserId: 1"
    }
}
