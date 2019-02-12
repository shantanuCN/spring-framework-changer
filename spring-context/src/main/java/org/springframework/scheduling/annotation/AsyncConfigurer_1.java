package org.springframework.scheduling.annotation;

import java.util.concurrent.Executor;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.lang.Nullable;

public interface AsyncConfigurer_1 {
    @Nullable
    default Executor getAsyncExecutor() {
        return null;
    }
}
