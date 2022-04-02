import WallService.comments

class PostNotFoundException : RuntimeException() {
    private val a: Post.Commentes
        get() {
            return a
        }

    fun myMethod(a: Post.Commentes): Post.Commentes {
        if(comments.isEmpty()) {
            throw RuntimeException("PostNotFoundException")
        }
        return comments.last()
    }
}