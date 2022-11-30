package HW2;

public class Polygon extends GeomFigure implements WithAngles {

    private int countVertex; // Кол-во вершин
    private int[] coordinatesX; // Массив координат вершин
    private int[] coordinatesY; // Массив координат вершин

    public Polygon(int countVertex, int[] coordinatesX, int[] coordinatesY) {
        this.countVertex = countVertex;
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
    }
    public int getCountVertex() {
        return countVertex;
    }

    public void setCountVertex (int countVertex) {
        this.countVertex = countVertex;
    }

    public int[] getCoordinatesX() {
        return coordinatesX;
    }

    public void setCoordinatesX (int[] coordinatesX) {
        this.coordinatesX = coordinatesX;
    }
    public int[] getCoordinatesY() {
        return coordinatesY;
    }

    public void setCoordinatesY (int[] coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    @Override
    public Double GetPerimeter() {
        double perimeter = 0;
        for (int i = 1; i < countVertex; i++) {
            perimeter += Math.sqrt((coordinatesX[i] - coordinatesX[i - 1]) * (coordinatesX[i] - coordinatesX[i - 1]) +
                    (coordinatesY[i] - coordinatesY[i - 1]) * (coordinatesY[i] - coordinatesY[i - 1]));

        }
        perimeter += Math.sqrt((coordinatesX[countVertex-1] - coordinatesX[0]) * (coordinatesX[countVertex-1] - coordinatesX[0]) +
                (coordinatesY[countVertex-1] - coordinatesY[0]) * (coordinatesY[countVertex-1] - coordinatesY[0]));


        return perimeter;
    }

    @Override
    public Double GetArea() {
        double area = 0;
        int j = countVertex - 1;
        for (int i = 0; i < countVertex; i++) {
            area += (coordinatesX[j] + coordinatesX[i]) * (coordinatesY[j] - coordinatesY[i]);
            j = i;
        }
        return Math.abs(area / 2.0);

    }

    @Override
    public void printCoordinatesVertex() {
        System.out.println("Polygon with " + countVertex + " vertex. Coordinates:");
        for (int i = 0; i < countVertex ; i++) {
            System.out.printf("(x%d = %d, y%d = %d)\n", i, coordinatesX[i], i, coordinatesY[i]);
        }

    }
    }



