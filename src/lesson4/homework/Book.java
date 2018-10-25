package lesson4.homework;

public class Book {
    private String title;


    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title +
                '}';
    }
}
