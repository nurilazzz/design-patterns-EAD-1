package kz.facade;

import kz.facade.additionalClasses.Transportation;
import kz.facade.db.Post;
import kz.facade.db.PostDB;
import kz.facade.subsystems.*;
import kz.facade.subsystems.transport.TransportCenterSystem;

public class PostOfficeSystem {
    private SortingCenterSystem sortingCenter = new SortingCenterSystem();
    private LogisticsCenterSystem logisticsCenter = new LogisticsCenterSystem();
    private DeliveryCenterSystem deliveryCenterSystem;
    private TransportCenterSystem transportCenterSystem;
    private final Post POST;

    public PostOfficeSystem(DeliveryCenterSystem deliveryCenterSystem,TransportCenterSystem transportCenterSystem, int postId) {
        this.deliveryCenterSystem = deliveryCenterSystem;
        this.transportCenterSystem = transportCenterSystem;
        this.POST = PostDB.getInstance().getPostById(postId);
    }
    public PostOfficeSystem(DeliveryCenterSystem deliveryCenterSystem, int postId) {
        this.deliveryCenterSystem = deliveryCenterSystem;
        this.POST = PostDB.getInstance().getPostById(postId);
    }
    public void deliver() {
        sortingCenter.sortAPost(POST);
        logisticsCenter.packAPost(POST);
        deliveryCenterSystem.deliverByDeliveryMethod(POST);
    }

    public void deliverByTransport() {
        Transportation transportation = new Transportation(transportCenterSystem);
        transportation.transportPost();
        sortingCenter.sortAPost(POST);
        logisticsCenter.packAPost(POST);
        deliveryCenterSystem.deliverByDeliveryMethod(POST);
    }
}
