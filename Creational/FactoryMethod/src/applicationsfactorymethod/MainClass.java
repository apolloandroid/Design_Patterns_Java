package applicationsfactorymethod;

import applicationsfactorymethod.developers.AndroidDeveloper;
import applicationsfactorymethod.developers.Developer;
import applicationsfactorymethod.developers.IosDeveloper;
import applicationsfactorymethod.developers.WebDeveloper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
    private static Developer developer;

    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String applicationPlatform = bufferedReader.readLine();
        initialize(applicationPlatform);
        developer.presentApplication();

    }

    private static void initialize(String applicationPlatform) throws IOException {
        switch (applicationPlatform) {
            case "Mobile": {
                createMobileApplication(applicationPlatform);
                break;
            }
            case ("Web"):
                developer = new WebDeveloper();
                break;
            default:
                System.out.println("No application platform input!");
        }
    }

    private static void createMobileApplication(String applicationPlatform) throws IOException {
        System.out.println("Input mobile platform name");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String mobilePlatformName = bufferedReader.readLine();
        switch (mobilePlatformName) {
            case ("Android"):
                developer = new AndroidDeveloper();
                break;
            case ("iOS"):
                developer = new IosDeveloper();
                break;
        }
    }

}
