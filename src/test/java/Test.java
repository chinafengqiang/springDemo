import cn.feng.bean.User;
import cn.feng.config.UserConfig;
import cn.feng.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p></p>
 *
 * @author: JQ.Feng
 * @create: 2020-02-03
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(UserConfig.class);
        User user = applicationContext.getBean(User.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println(user.toString());
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

    }
}

