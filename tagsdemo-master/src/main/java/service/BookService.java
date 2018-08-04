package service;

import domain.Book;
import domain.Category;

import java.util.Calendar;
import java.util.List;

/**
 * create by jack on 18-7-6
 */

public interface BookService {
    List<Category> getAllCategories();
    Category getCategory(int id);
    List<Book> getAllBooks();
    Book save(Book book);
    Book update(Book book);
    Book get(long id);
    long getNext();
}
