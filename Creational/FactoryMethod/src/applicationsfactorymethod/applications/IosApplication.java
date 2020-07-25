package applicationsfactorymethod.applications;

public class IosApplication extends MobileApplication {
    @Override
    public void install() {
        System.out.println("Поздравляем, мобильное приложение под iOS успешно установлено!");
    }

    @Override
    public void run() {
        System.out.println("Мобильное приложение под iOS запущено!");
    }
}
