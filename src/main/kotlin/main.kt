fun main() {

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
        Post.Commentes(77, 7),
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

    val origin1 = Post(
        id = 2,
        3,
        1,
        2,
        29012022,
        "Goodbye Maxim",
        1,
        2,
        false,
        Post.Commentes(88, 8),
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
    val origin2 = Post(
        id = 3,
        6,
        9,
        2,
        31032022,
        "Again hello Maxim",
        1,
        2,
        false,
        Post.Commentes(99, 9),
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


    println(WallService.add(origin))
    println(WallService.add(origin2))
    println(WallService.createComment(origin))
}