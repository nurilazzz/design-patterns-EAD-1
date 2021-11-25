package kz.facade.subsystems;

import kz.facade.additionalClasses.LoadingAnimation;
import kz.facade.db.Post;
import kz.facade.db.PostStatus;

public class TastamatCenterSystem implements DeliveryCenterSystem {

    @Override
    public void deliverByDeliveryMethod(Post post) {
        LoadingAnimation.animate("Delivering");
        post.setPostStatus(PostStatus.DELIVERED);
        post.setDescription("Your post is ready to be picked up in tastamat centers");
    }
}
