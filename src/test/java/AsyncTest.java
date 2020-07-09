import cn.feng.config.AsyncConfig;
import cn.feng.config.UserConfig;
import cn.feng.service.DemoService;
import cn.feng.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p></p>
 *
 * @author: JQ.Feng
 * @create: 2020-03-12
 */
public class AsyncTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AsyncConfig.class);
        DemoService demoService = applicationContext.getBean(DemoService.class);
        demoService.print();
    }
}

