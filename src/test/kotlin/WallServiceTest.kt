import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {


    @Test
    fun add() {
        WallService.clearArr()
        val result = WallService.add(
            Post(
                id = 9,
                1,
                2,
                3,
                20221205,
                "asd",
                1,
                2,
                false,
                Post.Comments(2),
                "asd",
                Post.Likes(2),
                Post.Reposts(2),
                Post.Views(4),
                PostType.Post,
                5,
                postponedId = 1
            )
        )
        assertNotEquals(0, result.id)
    }

    @Test
    fun updateTrue() {
        WallService.clearArr()
        WallService.add(
            Post(
                id = 9,
                1,
                2,
                3,
                20221205,
                "zxc",
                1,
                2,
                false,
                Post.Comments(2),
                "asd",
                Post.Likes(2),
                Post.Reposts(2),
                Post.Views(4),
                PostType.Post,
                5,
                postponedId = 1,
            )
        )
        WallService.add(
            Post(
                id = 9,
                1,
                2,
                3,
                20221205,
                "zxc",
                1,
                2,
                false,
                Post.Comments(2),
                "asd",
                Post.Likes(2),
                Post.Reposts(2),
                Post.Views(4),
                PostType.Post,
                5,
                postponedId = 1,
            )
        )
        val result = WallService.update(
            Post(
                id = 1,
                1,
                2,
                3,
                20221205,
                "zxc",
                1,
                2,
                false,
                Post.Comments(2),
                "asd",
                Post.Likes(2),
                Post.Reposts(2),
                Post.Views(4),
                PostType.Post,
                5,
                postponedId = 1,
            )
        )
        assertTrue(result)
    }

    @Test
    fun updateFalse() {
        WallService.clearArr()
        WallService.add(
            Post(
                id = 9,
                1,
                2,
                3,
                20221205,
                "zxc",
                1,
                2,
                false,
                Post.Comments(2),
                "asd",
                Post.Likes(2),
                Post.Reposts(2),
                Post.Views(4),
                PostType.Post,
                5,
                postponedId = 1,
            )
        )
        val result = WallService.update(
            Post(
                id = 9,
                1,
                2,
                3,
                20221205,
                "zxc",
                1,
                2,
                false,
                Post.Comments(2),
                "asd",
                Post.Likes(2),
                Post.Reposts(2),
                Post.Views(4),
                PostType.Post,
                5,
                postponedId = 1,
            )
        )
        assertFalse(result)
    }
}