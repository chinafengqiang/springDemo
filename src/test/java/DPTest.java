import cn.feng.config.AsyncConfig;
import cn.feng.config.DPConfig;
import cn.feng.dp.strategy.PayContextStrategy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p></p>
 *
 * @author: JQ.Feng
 * @create: 2020-03-13
 */
public class DPTest {
    public static final String BEAN_ID = "unionPayStrategy";
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DPConfig.class);
        PayContextStrategy payContextStrategy= applicationContext.getBean(PayContextStrategy.class);
        String html = payContextStrategy.toPayHtml(BEAN_ID);
        System.out.println(html);
    }
}

