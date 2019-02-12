package org.springframework.aop.aspectj;

import org.springframework.core.Ordered;

public interface AspectJPrecedenceInformation_1 extends Ordered {
    String getAspectName();

    int getDeclarationOrder();
}
