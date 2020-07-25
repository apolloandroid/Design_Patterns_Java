package applicationsfactorymethod.developers;

import applicationsfactorymethod.applications.Application;
import applicationsfactorymethod.applications.WebApplication;

public class WebDeveloper extends Developer {
    @Override
    protected Application createApplication() {
        return new WebApplication();
    }
}
