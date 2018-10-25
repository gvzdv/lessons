package lesson4.homework;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setTitle("Pushkin");

        Book book2 = new Book();
        book2.setTitle("Sorokin");

        Library library = new Library();
        library.put(book1, 3);
        library.put(book2, 1);
        library.showBooks();
    }


}
