package houseexample.housecomponents;

public class Garden {
    private double height;
    private double width;
    private double square = height * width;

    public Garden(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        return square;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
