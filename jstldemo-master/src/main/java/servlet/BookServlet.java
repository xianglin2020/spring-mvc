package servlet;

import domain.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Demo class
 *
 * @author jack
 * @date 18-7-10
 */
//@WebServlet(urlPatterns = "/books", name = "bookServlet")

@WebServlet("/books")
public class BookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Book> books = new ArrayList<>();
        Book book1 = new Book("1221212", "java", BigDecimal.valueOf(12.34));
        Book book2 = new Book("1dadsa2", "C#", BigDecimal.valueOf(1212.34));
        Book book3 = new Book("4534532", "Computer", BigDecimal.valueOf(142.34));
        books.add(book1);
        books.add(book2);
        books.add(book3);
        req.setAttribute("books", books);
        req.getRequestDispatcher("/books.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
