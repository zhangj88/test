package SpringMVC.Servlet3;

import SpringMVC.Config.SpringWebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by jzhang on 28/08/2015.
 */
public class MyWebInitializer extends
        AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { SpringWebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

}
