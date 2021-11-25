package kz.facade.additionalClasses;

import kz.facade.subsystems.transport.TransportCenterSystem;

public class Transportation {
    private TransportCenterSystem transportCenterSystem;

    public Transportation(TransportCenterSystem transportCenterSystem) {
        this.transportCenterSystem = transportCenterSystem;
    }

    public void setTransportCenterSystem(TransportCenterSystem transportCenterSystem) {
        this.transportCenterSystem = transportCenterSystem;
    }

    public void transportPost() {
        this.transportCenterSystem.deliverToSortingCenter();
    }
}
