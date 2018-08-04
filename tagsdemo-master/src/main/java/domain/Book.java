package domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Demo class
 *
 * @author jack
 * @date 18-7-6
 */
public class Book implements Serializable {
    public static final long serialVersionID = 1L;
    private long id;
    private String ibsn;
    private String title;
    private String author;
    private Category category;
    private BigDecimal price;


    public Book() {
    }

    public Book(long id, String ibsn, String title, String author, Category category, BigDecimal price) {
        this.id = id;
        this.ibsn = ibsn;
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public static long getSerialVersionID() {
        return serialVersionID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIbsn() {
        return ibsn;
    }

    public void setIbsn(String ibsn) {
        this.ibsn = ibsn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
