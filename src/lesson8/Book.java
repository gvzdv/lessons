package lesson8;

public class Book {
    private String title;
    int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public Book(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }
}
