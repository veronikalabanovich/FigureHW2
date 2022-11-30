package HW2;

public class Rhomb extends Polygon implements WithSide {

public Rhomb(int countVertex, int[] coordinatesX, int[] coordinatesY) {
    super(countVertex,coordinatesX, coordinatesY);
}

    @Override
    public int getCountSide() {
        return getCountVertex();
    }

}
