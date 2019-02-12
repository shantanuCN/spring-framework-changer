package org.springframework.aop.aspectj;

import org.springframework.core.Ordered;

public interface AspectJPrecedenceInformation_2 extends Ordered {
    boolean isBeforeAdvice();

    boolean isAfterAdvice();
}
