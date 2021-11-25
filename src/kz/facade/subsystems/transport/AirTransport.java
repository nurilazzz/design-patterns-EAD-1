package kz.facade.subsystems.transport;

import kz.facade.additionalClasses.LoadingAnimation;

public class AirTransport implements TransportCenterSystem{
    @Override
    public void deliverToSortingCenter() {
        LoadingAnimation.animate("Air transportation");
    }
}
