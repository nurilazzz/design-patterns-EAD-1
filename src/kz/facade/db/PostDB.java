package kz.facade.db;

import java.util.ArrayList;
import java.util.List;

public class PostDB {
    private static PostDB postDB;
    private static List<Post> postList = new ArrayList<>();

    private PostDB() {
    }

    static {
        postList.add(new Post("post1","post is from Almaty"));
        postList.add(new Post("post2","post is from Shymside"));
        postList.add(new Post("post3","post is from Petropavlsk"));
    }

    public List<Post> getPosts() {
        return postList;
    }

    public void savePost(Post post) {
        postList.add(post);
    }


    public Post getPostById(int id) {
        for (Post post : postList) {
            if (post.getId() == id) {
                return post;
            }
        }
        throw new ArrayIndexOutOfBoundsException("Post didn't find");
    }

    public void deletePostById(int id) {
        postList.removeIf(post -> post.getId() == id);
    }

    public static PostDB getInstance() {
        if (postDB == null) {
            postDB = new PostDB();
        }
        return postDB;
    }
}
