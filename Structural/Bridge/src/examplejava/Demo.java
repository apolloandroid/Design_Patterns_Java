package examplejava;

import examplejava.devices.Device;
import examplejava.devices.Radio;
import examplejava.devices.Tv;
import examplejava.remotes.AdvancedRemote;
import examplejava.remotes.BasicRemote;

public class Demo {

    public static void main(String[] args) {
        testDevice(new Radio());
        testDevice(new Tv());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests device with basic mode.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests device with advanced mode.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
