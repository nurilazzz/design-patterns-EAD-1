package kz.facade.db;

public class Post {
    private int id;
    private static int nextId = 0;
    private String name;
    private String description;
    private PostStatus postStatus;

    {
        id = nextId++;
        postStatus = PostStatus.SENT;
    }

    public Post(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PostStatus getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(PostStatus postStatus) {
        this.postStatus = postStatus;
    }

    @Override
    public String toString() {
        return "\nid: " + id + "\nname: " + name
                + "\ndescription: " + description
                + "\npost status: " + postStatus;
    }
}
