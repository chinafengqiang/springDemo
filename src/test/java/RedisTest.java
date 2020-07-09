import cn.feng.Application;
import cn.feng.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.Serializable;

/**
 * <p></p>
 *
 * @author: JQ.Feng
 * @create: 2020-03-18
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class RedisTest {
    @Autowired
    private RedisTemplate<String, Serializable> redisCacheTemplate;
    @Test
    public void test(){
        String key = "user:1";
        redisCacheTemplate.opsForValue().set(key,new User("user1",30));
        final User user = (User)redisCacheTemplate.opsForValue().get(key);
        System.out.println(user);
    }
}

