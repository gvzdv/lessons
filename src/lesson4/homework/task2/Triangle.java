package lesson4.homework.task2;

public class Triangle {
    private int x1;
    private int x2;
    private int x3;
    private int x4;
    private int y1;
    private int y2;
    private int y3;
    private int y4;

    public Triangle(int x1, int x2, int x3, int y1, int y2, int y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    public void getPerimeter(Triangle triangle) {
        double side12 =  Math.sqrt(Math.pow ((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double side23 = Math.sqrt(Math.pow ((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        double side13 = Math.sqrt(Math.pow ((x3 - x1), 2) + Math.pow((y3 - y1), 2));
//        double per = side12 + side13 + side23;
        System.out.println("Периметр треугольника: " + (side12 + side13 + side23));

    }


}
