package controller;

import domain.Product;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import validator.ProductValidator;

import javax.validation.Valid;

/**
 * Demo class
 *
 * @author jack
 * @date 18-7-8
 */
@Controller
public class ProductControllerWithJSP303 {
    private static final Log LOG = LogFactory.getLog(ProductControllerWithJSP303.class);

    @RequestMapping("add-product")
    public String inputProduct(Model model) {
        model.addAttribute("product", new Product());
        return "ProductForm";
    }

    // 利用Valid注解
    @RequestMapping("save-product")
    public String saveProduct(@Valid @ModelAttribute Product product, BindingResult bindingResult, Model model) {
        ProductValidator productValidator = new ProductValidator();
        productValidator.validate(product, bindingResult);

        if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            LOG.debug("code:" + fieldError.getCode() + ", field:" + fieldError.getField());
            return "ProductForm";
        }

        model.addAttribute("product", product);
        return "ProductDetails";
    }
}
