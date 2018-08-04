package domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Demo class
 *
 * @author jack
 * @date 18-7-10
 */
public class Book implements Serializable {
    private String isbn;
    private String title;
    private BigDecimal price;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Book(String isbn, String title, BigDecimal price) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
    }
}
