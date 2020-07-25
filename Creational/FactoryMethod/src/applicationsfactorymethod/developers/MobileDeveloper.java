package applicationsfactorymethod.developers;

import applicationsfactorymethod.applications.Application;
import applicationsfactorymethod.applications.MobileApplication;

public class MobileDeveloper extends Developer {

    @Override
    protected Application createApplication() {
        return new MobileApplication();
    }
}
