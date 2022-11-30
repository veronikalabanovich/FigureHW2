package HW2;

public class Restangle extends GeomFigure {
    private Double height;
    private Double width;

    public Restangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public Double GetPerimeter() {
        return width * 2 + height * 2;
    }

    @Override
    public Double GetArea() {
        return width * height;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

}
