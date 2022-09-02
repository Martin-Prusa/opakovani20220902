package cz.martin;

import cz.martin.books.Book;
import cz.martin.books.BooksService;

import java.util.ArrayList;
import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) {
        BooksService booksService = new BooksService();
        for (Book book : booksService.getUnknownAuthors()) {
            System.out.println(book.getName() + " - "+ book.getAuthor());
        }

        System.out.println();

        for (Book book : booksService.getMostExpensive()) {
            System.out.println(book.getName()+" - "+book.getCosts());
        }

        System.out.println();

        HashMap<String, Integer> authorsWithCount = booksService.getAuthorsWithCount();
        for (String s : authorsWithCount.keySet()) {
            System.out.println(s+" - "+authorsWithCount.get(s));
        }
    }
}
