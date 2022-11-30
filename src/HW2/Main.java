package HW2;

public class Main {
    public static void main(String[] args) {
        // круг
        Circle circle1 = new Circle(5, 1, 2, "RED" );
        System.out.println("-------Circle test-------");
        System.out.println(circle1.getColor());
        circle1.colorCircle("BLUE");
        System.out.println(circle1.getColor());
        System.out.printf("Area = %f, Perimeter = %f\n", circle1.GetArea(), circle1.GetPerimeter());
        circle1.setRadius(6);
        System.out.printf("Area = %f, Perimeter = %f\n", circle1.GetArea(), circle1.GetPerimeter());
        // прямоугольник
        Restangle restangle1 = new Restangle(5.0,3.0);
        System.out.println("-------Restangle test-------");
        System.out.printf("Area = %f, Perimeter = %f\n", restangle1.GetArea(), restangle1.GetPerimeter());
        // многоугольник
        Polygon polygon1 = new Polygon(4,new int[]{0,8,0,-8},new int[]{-6,0,6,0});
        System.out.println("-------Polygon test-------");
        polygon1.printCoordinatesVertex();
        System.out.printf("Area = %f, Perimeter = %f\n", polygon1.GetArea(), polygon1.GetPerimeter());
        // ромб
        Rhomb rhomb1 = new Rhomb(4, new int[] {-4,0,4,0}, new int[] {0,4,0,-4});
        System.out.println("-------Rhomb test-------");
        rhomb1.printCoordinatesVertex();
        System.out.printf("Area = %f, Perimeter = %f\n", rhomb1.GetArea(), rhomb1.GetPerimeter());
        System.out.println("CountSide: " + rhomb1.getCountSide());
    }

}
