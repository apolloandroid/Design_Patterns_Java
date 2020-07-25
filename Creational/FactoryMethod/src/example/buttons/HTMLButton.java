package example.buttons;


public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("Кнопка в стиле HTML отрисована");
    }

    @Override
    public void onClick() {
        System.out.println("Обработчик событий браузера установлен");
    }
}
