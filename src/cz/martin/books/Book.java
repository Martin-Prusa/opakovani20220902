package cz.martin.books;

public class Book {
    private String name;
    private String author;
    private int costs;

    public Book(String name, String author, int costs) {
        this.name = name;
        this.author = author;
        this.costs = costs;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getCosts() {
        return costs;
    }
}
