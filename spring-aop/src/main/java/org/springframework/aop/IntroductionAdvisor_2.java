package org.springframework.aop;

public interface IntroductionAdvisor_2 extends Advisor, IntroductionInfo {
    void validateInterfaces() throws IllegalArgumentException;
}
