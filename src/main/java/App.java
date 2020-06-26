import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld hw =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld hw2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat cat1 =
                (Cat) applicationContext.getBean("cat");
        Cat cat2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(hw.getMessage());
        System.out.println(hw == hw2);
        System.out.println(cat1 == cat2);
    }
}