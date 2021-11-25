package kz.facade.subsystems;

import kz.facade.additionalClasses.LoadingAnimation;
import kz.facade.db.Post;
import kz.facade.db.PostStatus;

public class LogisticsCenterSystem {

    public void packAPost(Post post){
        LoadingAnimation.animate("Packing");
        post.setPostStatus(PostStatus.ON_THE_WAY);
        post.setDescription("Your post has been packed");
    }
}
