import bean.Juggler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LIUJW-f
 * @date 2019/12/17
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        Juggler juggler = (Juggler) context.getBean("duke");
        juggler.perform();
    }

}
