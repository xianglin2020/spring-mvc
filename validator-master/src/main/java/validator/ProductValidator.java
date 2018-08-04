package validator;

import domain.Product;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Demo class
 *
 * @author jack
 * @date 18-7-8
 */

/**
 * 创建验证器，要实现Validator接口
 */
public class ProductValidator implements Validator {

    /**
     * 如果验证器可以处理指定的Class 则返回true
     *
     * @param aClass
     * @return
     */
    @Override
    public boolean supports(Class<?> aClass) {
        // 判定此 Class 对象所表示的类或接口与指定的 Class 参数所表示的类或接口是否相同，或是否是其超类或超接口。
        // 如果是则返回 true；否则返回 false。
        // 如果该 Class 表示一个基本类型，且指定的 Class 参数正是该 Class 对象，
        // 则该方法返回 true；否则返回 false。
        return Product.class.isAssignableFrom(aClass);
    }

    /**
     * validator方法验证目标对象，并将错误信息填入Error对象
     *
     * @param o
     * @param errors
     */
    @Override
    public void validate(Object o, Errors errors) {
        Product product = (Product) o;
        ValidationUtils.rejectIfEmpty(errors, "price", "price.required");
        ValidationUtils.rejectIfEmpty(errors, "productionDate", "productionDate.required");
        BigDecimal price = product.getPrice();
        if (price != null && price.compareTo(BigDecimal.ZERO) < 0) {
            // 在Errors对象上调用一个reject、或者rejectValue方法，
            // 调用reject，会往FieldError添加一个ObjectError和rejectValue。
            // 大多时候，只给方法传入一个错误码，Spring会查找错误码获取相应错误消息，
            // 当然可以传入一个默认消息，当没有找到时使用。
            errors.rejectValue("price", "price.negative");
        }
        LocalDate productionDate = product.getProductionDate();
        if (productionDate != null) {
            if (productionDate.isAfter(LocalDate.now())) {
                errors.rejectValue("productionDate", "productionDate.invalid");
            }
        }
    }
}
