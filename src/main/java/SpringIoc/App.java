package SpringIoc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by jie on 2015/8/26.
 */
@Configuration
@ComponentScan({"SpringIoc","SpringAOP"})
@EnableAspectJAutoProxy
public class App {
    public static void main(String args[]) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(
                App.class);
        try {
            SmartBoss boss = context.getBean(SmartBoss.class);
            boss.goSomewhere();
        } finally {
            context.close();
        }    }
}
