package phoneexample;

import phoneexample.factories.AndroidDeviceFactory;
import phoneexample.factories.AppleDeviceFactory;
import phoneexample.factories.DeviceFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static String getDeviceMark() throws IOException {
        String deviceMark;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        deviceMark = bufferedReader.readLine();
        bufferedReader.close();
        return deviceMark;
    }

    private static DeviceFactory getDeviceFactory(String deviceMark) {
        DeviceFactory deviceFactory;
        switch (deviceMark) {
            case "Apple":
                deviceFactory = new AppleDeviceFactory();
                break;
            default:
                deviceFactory = new AndroidDeviceFactory();
                break;
        }
        return deviceFactory;
    }

    private static void createDeviceKit(DeviceFactory deviceFactory) {
        deviceFactory.installOperatingSystem().printName();
        deviceFactory.addHeadPhones().printName();
    }

    public static void main(String[] args) throws IOException {
        createDeviceKit(getDeviceFactory(getDeviceMark()));
    }
}
