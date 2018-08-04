package listener;

import javax.el.ELContext;
import javax.el.ELContextEvent;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.jsp.JspFactory;

/**
 * Demo class
 *
 * @author jack
 * @date 18-7-9
 */
public class ELImportListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        JspFactory.getDefaultFactory().getJspApplicationContext(
                servletContextEvent.getServletContext()).addELContextListener(
                (ELContextEvent e) -> {
                    // 崩了呀
                }
        );
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
