package kz.facade.subsystems.transport;

import kz.facade.additionalClasses.LoadingAnimation;

public class TrainTransport implements TransportCenterSystem{
    @Override
    public void deliverToSortingCenter() {
        LoadingAnimation.animate("Train transportation");
    }
}
