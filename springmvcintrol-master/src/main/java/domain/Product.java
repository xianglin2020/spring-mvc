package domain;

import java.math.BigDecimal;

/**
 * Demo class
 *
 * @author jack
 * @date 18-7-6
 */
public class Product {
    private String name;
    private String desc;
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
