package buildexample.buildings;

public interface Building {
    default void sayHello() {
        System.out.println("I am a " + this.getClass() + "!");
    }
}
