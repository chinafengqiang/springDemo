import cn.feng.bean.Car;
import cn.feng.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p></p>
 *
 * @author: JQ.Feng
 * @create: 2020-02-12
 */
public class LifeCycleTest {
    private AnnotationConfigApplicationContext applicationContext;

    private void getApplicationContext(){
        applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
    }
    @Test
    public void testLifeCycle(){
        //创建IOC容器
        getApplicationContext();
        System.out.println("创建容器完成...");
        Car car = (Car)applicationContext.getBean("car");
        car.print();
        applicationContext.close();
    }
}

