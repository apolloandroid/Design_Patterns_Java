package phoneexample.factories;

import phoneexample.headphones.AnyOtherHeadPhones;
import phoneexample.headphones.HeadPhones;
import phoneexample.os.AndroidOS;
import phoneexample.os.OperatingSystem;

public class AndroidDeviceFactory implements DeviceFactory {
    @Override
    public OperatingSystem installOperatingSystem() {
        return new AndroidOS();
    }

    @Override
    public HeadPhones addHeadPhones() {
        return new AnyOtherHeadPhones();
    }
}
