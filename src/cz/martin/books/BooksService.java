package cz.martin.books;

import java.util.HashMap;
import java.util.List;

public class BooksService {
    private List<Book> books;

    private HashMap<String, Integer> authorsWithCount = new HashMap<>();

    public BooksService() {
        this.books = new BooksRepository().getBooks();

        for (Book book : this.books) {
            this.authorsWithCount.putIfAbsent(book.getAuthor(), 0);
            this.authorsWithCount.put(book.getAuthor(), this.authorsWithCount.get(book.getAuthor()) + 1);
        }
    }

    public List<Book> getUnknownAuthors() {
        return books.stream().filter(i -> i.getAuthor().equalsIgnoreCase("")).toList();
    }

    public List<Book> getMostExpensive() {
        return books.stream().sorted((i, j) -> j.getCosts() - i.getCosts()).toList().subList(0,3);
    }

    public HashMap<String, Integer> getAuthorsWithCount() {
        return authorsWithCount;
    }
}
