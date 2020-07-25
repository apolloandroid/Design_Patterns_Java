package example.buttons;


public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Кнопка в стиле Windows отрисована");
    }

    @Override
    public void onClick() {
        System.out.println("Обработчик событий Windows установлен");
    }
}
