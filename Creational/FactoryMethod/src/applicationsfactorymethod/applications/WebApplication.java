package applicationsfactorymethod.applications;

public class WebApplication implements Application {
    @Override
    public void install() {
        System.out.println("Поздравляем, Web-приложение успешно установлено!");
    }

    @Override
    public void run() {
        System.out.println("Web-приложение запущено!");
    }
}
