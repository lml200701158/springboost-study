package springboost;

import com.example.service.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.example.service"})
public class MyTest {

    public static void main(String args[]) {
        ApplicationContext context = new AnnotationConfigApplicationContext(UserServer.class);
        UserServer user = context.getBean(UserServer.class);
        //user.test();
    }
}
