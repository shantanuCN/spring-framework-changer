package org.springframework.beans.factory.xml;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.lang.Nullable;

public interface NamespaceHandler_2 {
    @Nullable
    BeanDefinition parse(Element element, ParserContext parserContext);

    @Nullable
    BeanDefinitionHolder decorate(Node source, BeanDefinitionHolder definition, ParserContext parserContext);
}
