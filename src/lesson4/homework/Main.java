package lesson4.homework;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Pushkin", 3);
        Book book2 = new Book("Sorokin", 7);

        Library library = new Library(20);
        library.put(book1, 3);
        library.put(book2, 7);

        library.get(book2, 6);
        library.get(book2, 3);
        library.get(book2, 3);
    }


}
