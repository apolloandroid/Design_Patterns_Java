package applicationsfactorymethod.developers;

import applicationsfactorymethod.applications.AndroidApplication;
import applicationsfactorymethod.applications.Application;

public class AndroidDeveloper extends MobileDeveloper {
    @Override
    protected Application createApplication() {
        return new AndroidApplication();
    }
}
