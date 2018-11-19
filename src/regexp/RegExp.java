package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args) {

        String string = "Строка 1 для_поиска и замены СИМВОЛОВ ё";
        String pattern = "иск";
        System.out.println(string.replaceAll(pattern, "*!*"));

        pattern = "^Стр"; // ^ - начало строки, $ - конец строки;
        System.out.println(string.replaceAll(pattern, "*!*"));

        pattern = "[иск]"; // [] перечень символов
        System.out.println(string.replaceAll(pattern, "*"));

        pattern = "[^иск]"; // поиск любых символов, кроме указанных
        System.out.println(string.replaceAll(pattern, "*"));

        pattern = "\\d"; // цифровой символ
        System.out.println(string.replaceAll(pattern, "*"));

        pattern = "\\D"; // нецифровой символ
        System.out.println(string.replaceAll(pattern, "*"));

        pattern = "\\w"; // w - буквенно-цифровой символ или _
        System.out.println(string.replaceAll(pattern, "*"));

        pattern = "\\W"; // W - не w
        System.out.println(string.replaceAll(pattern, "*"));

        pattern = "\\s"; // любой пробельный символ
        System.out.println(string.replaceAll(pattern, "*"));

        pattern = "\\S"; // любой непробельный символ
        System.out.println(string.replaceAll(pattern, "*"));

        pattern = "[а-яё]"; // все маленькие буквы
        System.out.println(string.replaceAll(pattern, "*"));

        pattern = "[А-Я]"; // все заглавные буквы
        System.out.println(string.replaceAll(pattern, "*"));

        pattern = "[а-яА-Я0-9]"; // если указать [А-Я][0-9], то будет убирать связку загл. буква + цифра
        System.out.println(string.replaceAll(pattern, "*"));

        string = "Строка 1 для_поииииска и замены СИМВОЛОВ ё";
        pattern = "и{3}";
        System.out.println(string.replaceAll(pattern, "*"));

        string = "Строка 1 [] для_поииииска и замены СИМВОЛОВ ё";
        pattern = "\\[\\]"; // если указать [А-Я][0-9], то будет убирать связку загл. буква + цифра
        System.out.println(string.replaceAll(pattern, "*"));

        string = "Строка 1 [для_поииииска] и замены СИМВОЛОВ ё";
        string = "Строка 1 [] для_поииииска и замены СИМВОЛОВ ё";
        pattern = "\\[\\]"; // если указать [А-Я][0-9], то будет убирать связку загл. буква + цифра
        System.out.println(string.replaceAll(pattern, "*"));

        string = "Строка В1 [] для_поииииска и замены СИМВОЛОВ ё";
        pattern = "(ии|В1)"; // ищет такое или такое
        System.out.println(string.replaceAll(pattern, "*"));


//        Pattern | Matcher, паттерном создаём шаблон, мэтчером ищем совпадения
        string = "String B 1 to search and replace CHARS";
//        string = "Str";
        Pattern pattern1 = Pattern.compile(".{6}"); // точка - любой символ в строке, {} - повторение, 6 - от, бесконечность - до
        pattern1 = Pattern.compile("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"); // минимум 8 символов, цифра, буква маленькая, буква большая
        Matcher matcher = pattern1.matcher(string);
        System.out.println(matcher.find()); // true | false - ищет указанные символы
        System.out.println(matcher.matches()); // true | false - ищет полное соответствие строки
        // ?= - ищется совпадение
        // [] - символы друг за другом, () - символы не подряд
        // .*\\d - числу предшествует символ в количестве от 0 до бесконечности
        // * - любое количество от 0

    }
}
