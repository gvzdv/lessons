package lesson2.homework;

public class Task8 {

    public static void main(String[] args) {

        int x1 = 1;
        int x2 = 0;
        int y1 = 2;
        int y2 = 3;
        int z1 = 3;
        int z2 = 0;
        double XY =  Math.pow ((x1 - y1), 2) + Math.pow((x2 - y2), 2);
        double YZ = Math.pow ((y1 - z1), 2) + Math.pow((y2 - z2), 2);
        double XZ = Math.pow ((x1 - z1), 2) + Math.pow((x2 - z2), 2);

        if (((XY + YZ) == XZ) | ((YZ + XZ) == XY) | ((XY + XZ) == YZ)) {
            System.out.println("Треугольник является прямоугольным");
        } else System.out.println("Треугольник не является прямоугольным");


    }
}
