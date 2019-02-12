package org.springframework.aop.framework;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.TargetClassAware;
import org.springframework.aop.TargetSource;

public interface Advised_2 extends TargetClassAware {
    TargetSource getTargetSource();
}
