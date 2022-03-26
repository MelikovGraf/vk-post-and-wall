fun main() {

    val origin = Post(
        id = 1,
        1,
        6,
        7,
        20201205,
        "qwe",
        1,
        2,
        false,
        Post.Comments(2),
        "bnm",
        Post.Likes(2),
        Post.Reposts(2),
        Post.Views(4),
        PostType.Post,
        5,
        postponedId = 1
    )

    val origin1 = Post(
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
    val origin2 = Post(
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
    WallService.add(origin1)
    WallService.add(origin2)
    print(WallService.update(origin))
}