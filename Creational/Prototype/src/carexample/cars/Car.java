package carexample.cars;

public class Car implements Copyable {
    private int seats;
    private int wheels;
    private String mark;
    private String carCase;

    public Car() {
    }

    public Car(int seats, int wheels, String mark, String carCase) {
        this.seats = seats;
        this.wheels = wheels;
        this.mark = mark;
        this.carCase = carCase;
    }

    public int getSeats() {
        return seats;
    }

    public int getWheels() {
        return wheels;
    }

    public String getMark() {
        return mark;
    }

    public String getCarCase() {
        return carCase;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setCarCase(String carCase) {
        this.carCase = carCase;
    }

    @Override
    public Object copy() {
        return new Car(this.seats, this.wheels, this.mark, this.carCase);
    }

    public void printProperties() {
        System.out.println(this.seats + " " + this.carCase + " " + this.mark + " " + this.wheels);
    }
}
