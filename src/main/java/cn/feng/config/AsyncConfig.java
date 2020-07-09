package cn.feng.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * <p>
 *     spring异步操作
 *     自定义线程池
 * </p>
 *
 * @author: JQ.Feng
 * @create: 2020-03-12
 */
@Configuration
@EnableAsync
@ComponentScan(value = "cn.feng.service")
public class AsyncConfig {
    private static final int MAX_POOL_SIZE = 50;
    private static final int CORE_POOL_SIZE = 20;
    @Bean("taskExecutor")
    public AsyncTaskExecutor taskExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setMaxPoolSize(MAX_POOL_SIZE);
        taskExecutor.setCorePoolSize(CORE_POOL_SIZE);
        taskExecutor.setThreadNamePrefix("async-task-thread-pool");
        taskExecutor.initialize();
        return taskExecutor;
    }
}

