package formatter;

import org.springframework.format.FormatterRegistrar;
import org.springframework.format.FormatterRegistry;

/**
 * Demo class
 *
 * @author jack
 * @date 18-7-7
 */
public class MyFormatterRegister implements FormatterRegistrar {
    private String datePattern;

    public MyFormatterRegister(String datePattern) {
        this.datePattern = datePattern;
    }

    @Override
    public void registerFormatters(FormatterRegistry formatterRegistry) {
        formatterRegistry.addFormatter(new LocalDateFormatter(this.datePattern));
    }
}
