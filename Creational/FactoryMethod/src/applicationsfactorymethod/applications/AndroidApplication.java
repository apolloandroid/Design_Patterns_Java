package applicationsfactorymethod.applications;

public class AndroidApplication extends MobileApplication {
    @Override
    public void run() {
        System.out.println("Поздравляем, мобильное приложение под Android успешно установлено!");
    }

    @Override
    public void install() {
        System.out.println("Мобильное приложение под Android запущено!");
    }
}
