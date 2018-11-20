package homeworkSyntax;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        String input;

        while (true) {
            input = in.nextLine();

            if (input.equals("exit")) {
                break;
            }

            if (input.contains(".")) {
                try {
                    Double d = Double.parseDouble(input);
                    print(d);
                    continue;
                } catch (Exception e) {
                    System.out.println("неудачная попытка преобразования в double");
                }
            }

            try {
                short d = Short.parseShort(input);
                if (d > 0 && d < 128) {
                    print(d);
                    continue;
                }
//                    else{
//                        throw  new Exception();
//                    }
            } catch (Exception e) {
                System.out.println("неудачная попытка преобразования в short");
            }

            try {
                Integer d = Integer.parseInt(input);
                print(d);
                continue;
            } catch (Exception e) {
                System.out.println("неудачная попытка преобразования в Integer");
            }

            print(input);

        }
    }

    public static void print(Double value) {
        System.out.println("double:" + value);
//        String name = new Object(){}.getClass().getEnclosingMethod().getName();
//        System.out.println(name);
    }

    public static void print(Integer value) {
        System.out.println("int:" + value);
    }

    public static void print(short value) {
        System.out.println("short:" + value);
    }

    public static void print(String value) {
        System.out.println(value);
    }
}
