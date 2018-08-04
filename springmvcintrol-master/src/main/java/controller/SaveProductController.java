package controller;

import domain.Product;
import form.ProductForm;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;

/**
 * Demo class
 *
 * @author jack
 * @date 18-7-6
 */
public class SaveProductController implements Controller {
    private static final Log LOG = LogFactory.getLog(SaveProductController.class);

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        LOG.info("SaveProductController called");
        ProductForm productForm = new ProductForm();
        productForm.setName(httpServletRequest.getParameter("name"));
        productForm.setDesc(httpServletRequest.getParameter("desc"));
        productForm.setPrice(httpServletRequest.getParameter("price"));

        Product product = new Product();
        product.setName(productForm.getName());
        product.setDesc(productForm.getDesc());
        product.setPrice(BigDecimal.valueOf(Float.parseFloat(productForm.getPrice())));

        return new ModelAndView("/WEB-INF/jsp/ProductDetails.jsp","product",product);
    }
}
