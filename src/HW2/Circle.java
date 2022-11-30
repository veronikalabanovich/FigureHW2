package HW2;

public class Circle extends GeomFigure {
    private int radius;
    private int centerX;
    private int centerY;
    private String color;

    public Circle() {
        centerX = centerY = 0;
        radius = 1;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(int radius, int centerX, int centerY, String color) {
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
        this.color = color;

    }

    public int getCenterX() {
        return centerX;
    }

    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void colorCircle(String new_color) {
        this.color = new_color;
    }

    @Override
    public Double GetPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public Double GetArea() {
        return Math.PI * radius * radius;
    }


}