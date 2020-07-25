package phoneexample.factories;

import phoneexample.headphones.AirPods;
import phoneexample.headphones.HeadPhones;
import phoneexample.os.Ios;
import phoneexample.os.OperatingSystem;

public class AppleDeviceFactory implements DeviceFactory {
    @Override
    public OperatingSystem installOperatingSystem() {
        return new Ios();
    }

    @Override
    public HeadPhones addHeadPhones() {
        return new AirPods();
    }
}
