import org.example.si.propertySource.JdbcProperties;
import org.example.si.propertySource.JdbcPropertiesConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JdbcPropertiesApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(JdbcPropertiesConfiguration.class);
        System.out.println(cxt.getBean(JdbcProperties.class));
    }
}
