package applicationexample;

import applicationexample.applications.Application;
import applicationexample.builders.ApplicationBuilder;
import applicationexample.builders.Builder;
import applicationexample.director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Builder applicationBuilder = new ApplicationBuilder();

        director.createAndroidApplication(applicationBuilder);
        Application application = applicationBuilder.getResult();
        System.out.println(application.getType());

        director.createIosApplication(applicationBuilder);
        application = applicationBuilder.getResult();
        System.out.println(application.getType());

        director.createDesktopApplication(applicationBuilder);
        application = applicationBuilder.getResult();
        System.out.println(application.getType());

        director.createEmbeddedApplication(applicationBuilder);
        application = applicationBuilder.getResult();
        System.out.println(application.getType());

        director.createWebApplication(applicationBuilder);
        application = applicationBuilder.getResult();
        System.out.println(application.getType());
    }
}
