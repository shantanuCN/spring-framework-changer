package org.springframework.aop.aspectj.annotation;

import java.lang.reflect.Method;
import java.util.List;
import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.framework.AopConfigException;
import org.springframework.lang.Nullable;

public interface AspectJAdvisorFactory_1 {
    boolean isAspect(Class<?> clazz);

    List<Advisor> getAdvisors(MetadataAwareAspectInstanceFactory aspectInstanceFactory);
}
