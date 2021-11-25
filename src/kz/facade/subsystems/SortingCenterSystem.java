package kz.facade.subsystems;

import kz.facade.additionalClasses.LoadingAnimation;
import kz.facade.db.Post;
import kz.facade.db.PostStatus;

public class SortingCenterSystem {

    public void sortAPost(Post post){
        LoadingAnimation.animate("Sorting");
        post.setPostStatus(PostStatus.SORTED);
        post.setDescription("Your post has been sorted");
    }
}
