package SpringIoc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by jie on 2015/8/26.
 */
public class App {
    public static void main(String args[]) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(
                "SpringIoc");
        try {
            SmartBoss boss = context.getBean(SmartBoss.class);
            boss.goSomewhere();
        } finally {
            context.close();
        }    }
}
