package applicationsfactorymethod.developers;

import applicationsfactorymethod.applications.Application;

public abstract class Developer {
    public final void presentApplication() {
        Application application = createApplication();
        application.install();
        application.run();
    }

    protected abstract Application createApplication();
}
