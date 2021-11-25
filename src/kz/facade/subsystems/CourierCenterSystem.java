package kz.facade.subsystems;

import kz.facade.additionalClasses.LoadingAnimation;
import kz.facade.db.Post;
import kz.facade.db.PostStatus;

public class CourierCenterSystem implements DeliveryCenterSystem {

    @Override
    public void deliverByDeliveryMethod(Post post) {
        LoadingAnimation.animate("Delivering");
        post.setPostStatus(PostStatus.DELIVERED);
        post.setDescription("Your post has been delivered by courier service");
    }
}
