import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {


    @Test
    fun add() {
        WallService.clearArr()
        val result = WallService.add(
            Post(
                id = 1,
                1,
                6,
                7,
                25032022,
                "Hello Maxim",
                1,
                2,
                false,
                Post.Commentes(44, 4),
                "Why not?",
                Post.Likes(2),
                Post.Reposts(2),
                Post.Views(4),
                PostType.Post,
                Post.PostSource("photo", "vk", "13-07-2022", "url.ru"),
                Post.ArrayAttachments("audio"),
                Post.Geo("String", "vk", Post.Geo.Place("String")),
                5,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                Post.Donut(false, 1, Post.Donut.Placeholder("Tver"), false, "nightmare"),
                1)
        )
        assertNotEquals(0, result.id)
    }

    @Test
    fun updateTrue() {
        WallService.clearArr()
        WallService.add(
            Post(
                id = 2,
                3,
                1,
                2,
                29012022,
                "Goodbye Maxim",
                1,
                2,
                false,
                Post.Commentes(33, 3),
                "Why not?",
                Post.Likes(2),
                Post.Reposts(2),
                Post.Views(4),
                PostType.Post,
                Post.PostSource("photo", "vk", "13-07-2022", "url.ru"),
                Post.ArrayAttachments("audio"),
                Post.Geo("String", "vk", Post.Geo.Place("String")),
                5,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                Post.Donut(false, 1, Post.Donut.Placeholder("Tver"), false, "nightmare"),
                1
            )
        )
        WallService.add(
            Post(
                id = 1,
                1,
                6,
                7,
                25032022,
                "Hello Maxim",
                1,
                2,
                false,
                Post.Commentes(55, 5),
                "Why not?",
                Post.Likes(2),
                Post.Reposts(2),
                Post.Views(4),
                PostType.Post,
                Post.PostSource("photo", "vk", "13-07-2022", "url.ru"),
                Post.ArrayAttachments("audio"),
                Post.Geo("String", "vk", Post.Geo.Place("String")),
                5,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                Post.Donut(false, 1, Post.Donut.Placeholder("Tver"), false, "nightmare"),
                1
            )
        )
        val result = WallService.update(
            Post(
                id = 1,
                1,
                6,
                7,
                25032022,
                "Hello Maxim",
                1,
                2,
                false,
                Post.Commentes(66, 6),
                "Why not?",
                Post.Likes(2),
                Post.Reposts(2),
                Post.Views(4),
                PostType.Post,
                Post.PostSource("photo", "vk", "13-07-2022", "url.ru"),
                Post.ArrayAttachments("audio"),
                Post.Geo("String", "vk", Post.Geo.Place("String")),
                5,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                Post.Donut(false, 1, Post.Donut.Placeholder("Tver"), false, "nightmare"),
                1
            )
        )
        assertTrue(result)
    }

    @Test
    fun updateFalse() {
        WallService.clearArr()
        WallService.add(
            Post(
                id = 1,
                1,
                6,
                7,
                25032022,
                "Hello Maxim",
                1,
                2,
                false,
                Post.Commentes(11, 2),
                "Why not?",
                Post.Likes(2),
                Post.Reposts(2),
                Post.Views(4),
                PostType.Post,
                Post.PostSource("photo", "vk", "13-07-2022", "url.ru"),
                Post.ArrayAttachments("audio"),
                Post.Geo("String", "vk", Post.Geo.Place("String")),
                5,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                Post.Donut(false, 1, Post.Donut.Placeholder("Tver"), false, "nightmare"),
                1
            )
        )
        val result = WallService.update(
            Post(
                id = 2,
                3,
                1,
                2,
                29012022,
                "Goodbye Maxim",
                1,
                2,
                false,
                Post.Commentes(22, 1),
                "Why not?",
                Post.Likes(2),
                Post.Reposts(2),
                Post.Views(4),
                PostType.Post,
                Post.PostSource("photo", "vk", "13-07-2022", "url.ru"),
                Post.ArrayAttachments("audio"),
                Post.Geo("String", "vk", Post.Geo.Place("String")),
                5,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                Post.Donut(false, 1, Post.Donut.Placeholder("Tver"), false, "nightmare"),
                1
            )
        )
        assertFalse(result)
    }

    @Test
    fun createComment() {
        WallService.clearArr()
        val origin = Post(
            id = 1,
            1,
            6,
            7,
            25032022,
            "Hello Maxim",
            1,
            2,
            false,
            Post.Commentes(11, 2),
            "Why not?",
            Post.Likes(2),
            Post.Reposts(2),
            Post.Views(4),
            PostType.Post,
            Post.PostSource("photo", "vk", "13-07-2022", "url.ru"),
            Post.ArrayAttachments("audio"),
            Post.Geo("String", "vk", Post.Geo.Place("String")),
            5,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            Post.Donut(false, 1, Post.Donut.Placeholder("Tver"), false, "nightmare"),
            1
        )
        WallService.add(origin)
        val result = WallService.createComment(origin)
        assertEquals(Post.Commentes(id = 11,
            count = 2,
            canPost = true,
            groupsCanPost = true,
            canClose = true,
            canOpen = true), result)
    }

    @Test(expected = PostNotFoundException::class) // функция выдает ошибку (проверил через мейн), но почему то не засчитывается тест как верный. Не могу понять
    fun shouldThrow() {
        WallService.clearArr()
        val origin = Post(
            id = 1,
            1,
            6,
            7,
            25032022,
            "Hello Maxim",
            1,
            2,
            false,
            Post.Commentes(null, null),
            "Why not?",
            Post.Likes(2),
            Post.Reposts(2),
            Post.Views(4),
            PostType.Post,
            Post.PostSource("photo", "vk", "13-07-2022", "url.ru"),
            Post.ArrayAttachments("audio"),
            Post.Geo("String", "vk", Post.Geo.Place("String")),
            5,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            Post.Donut(false, 1, Post.Donut.Placeholder("Tver"), false, "nightmare"),
            1
        )
        WallService.createComment(origin)
    }
}
