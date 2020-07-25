package phoneexample.factories;

import phoneexample.headphones.HeadPhones;
import phoneexample.os.OperatingSystem;

public interface DeviceFactory {
    OperatingSystem installOperatingSystem();

    HeadPhones addHeadPhones();
}
