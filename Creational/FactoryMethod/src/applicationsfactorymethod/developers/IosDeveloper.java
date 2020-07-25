package applicationsfactorymethod.developers;

import applicationsfactorymethod.applications.Application;
import applicationsfactorymethod.applications.IosApplication;

public class IosDeveloper extends MobileDeveloper {
    @Override
    protected Application createApplication() {
        return new IosApplication();
    }
}
