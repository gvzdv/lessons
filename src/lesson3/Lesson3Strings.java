package lesson3;

import java.util.Arrays;

public class Lesson3Strings {
    public static void main(String[] args) {
        String str = "String";
        String str2 = new String("String");

        String str3 = String.format("String %02d", 8); // применяется редко
        System.out.println(str3);

        String str4 = "String String";
        String str5 = "String";
        String str6 = "strinG";

        System.out.println(str == str2); // false
        System.out.println(str == str5); // true, но строки нельзя сравнивать при помощи ==

        System.out.println(str.equals(str2)); // true
        System.out.println(str.equals(str5)); // true

        System.out.println(str.equalsIgnoreCase(str6)); // true, сравнивает без учёта регистра
        System.out.println(str.equals(str6)); // false

        System.out.println(str. startsWith("Qfgh")); // начинается ли строка с указанных символов
        System.out.println(str.endsWith("g")); // заканчивается ли указанными символами

        String str10 = "string";
        String str11 = new String("string");
        String str12 = "str";
        String str13 = "String string";

        System.out.println(str10.compareTo(str11)); // возвращает 0, если обе строки равны
        System.out.println(str11.compareTo(str12)); // если положит рез-т, то вызывающая строка > вызываемой и наоборот
        System.out.println(str11.compareTo(str13)); //
        System.out.println(str11.compareToIgnoreCase(str13));

        // сортировка
        String a = "Astring";
        String b = "Bstring";
        String c = "Строка\n \"строка\"";

        String[] strArr = {c, a, b};
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        // взятие подстроки
        System.out.println(c.substring(3, 13)); // из указанной строчки возьмёт подстроку, начиная с 3-го элемента по 13-й
        System.out.println(a.contains("str")); // true, когда искомая подстрочка в указанной строке найдена

        String[] arr = {"qwe", "rty", "yui"};
        System.out.println(Arrays.toString(arr));

        String string = "First ";
        String string2 = "Second ";
        string2 += string; // "Second " + "First "
        System.out.println(string2); // Second First

        for (int i = 0; i < 10; i++) {
            string += string2; // не изменяют переменные, а создают новые строки (расходуют память)

        }
        System.out.println(string);

//        StringBuffer | StringBuilder -- позволяют изменять имеющиеся строки
//        StringBuilder -- производителен, но нельзя работать в потоках
//        StringBuffer -- можно использовать в потоках

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string); // append -- добавляет строку
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(" string ").append(" str ");
        }

        System.out.println(stringBuilder.toString());







    }

}
