package controller;

import domain.Product;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Demo class
 *
 * @author jack
 * @date 18-7-10
 */
@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("input")
    public String input(@ModelAttribute Product product) {
        return "ProductForm";
    }
}
