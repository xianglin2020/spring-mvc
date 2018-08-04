package controller;

import domain.Book;
import domain.Category;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import service.BookService;
import java.util.List;

/**
 * Demo class
 *
 * @author jack
 * @date 18-7-6
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    private static final Log LOG = LogFactory.getLog(BookController.class);

    @RequestMapping(value = "/input-book")
    public String inputBook(Model model) {
        List<Category> categories = bookService.getAllCategories();
        model.addAttribute("categories", categories);
        model.addAttribute("book", new Book());
        return "BookAddForm";
    }

    @RequestMapping(value = "/edit-book/{id}")
    public String editBook(Model model, @PathVariable long id) {
        List<Category> categories = bookService.getAllCategories();
        model.addAttribute("categories", categories);
        Book book = bookService.get(id);
        model.addAttribute("book", book);
        return "BookEditForm";
    }

    @RequestMapping(value = "/save-book")
    public String saveBook(@ModelAttribute Book book) {
        Category category = bookService.getCategory(book.getCategory().getId());
        book.setCategory(category);
        bookService.save(book);
        // 不要加"/"
        return "redirect:list-book";
    }

    @RequestMapping(value = "/update-book")
    public String updateBook(@ModelAttribute Book book) {
        Category category = bookService.getCategory(book.getCategory().getId());
        book.setCategory(category);
        bookService.update(book);
        return "redirect:list-book";
    }

    @RequestMapping(value = "list-book")
    public String listBooks(Model model) {
        LOG.info("listBooks");
        List<Book> books = bookService.getAllBooks();
        model.addAttribute("books", books);
        LOG.info(books.size());
        return "BookList";
    }
}
