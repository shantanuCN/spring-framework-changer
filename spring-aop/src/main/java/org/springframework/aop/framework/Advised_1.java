package org.springframework.aop.framework;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.TargetClassAware;
import org.springframework.aop.TargetSource;

public interface Advised_1 extends TargetClassAware {
    boolean isFrozen();

    void addAdvisor(Advisor advisor) throws AopConfigException;

    void addAdvisor(int pos, Advisor advisor) throws AopConfigException;
}
