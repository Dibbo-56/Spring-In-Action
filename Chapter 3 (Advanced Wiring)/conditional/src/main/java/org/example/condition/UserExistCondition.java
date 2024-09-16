package org.example.condition;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Arrays;

/**
 * @author dibyendu.debnath
 * @since 9/16/24
 */
public class UserExistCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        BeanDefinitionRegistry beanDefinitionRegistry = context.getRegistry();
        ResourceLoader resourceLoader = context.getResourceLoader();

        String[] beanDefinitionNames = beanDefinitionRegistry.getBeanDefinitionNames();

        boolean isConditionMatched = resourceLoader.getResource("scripts/dev_create_table.sql").exists()
                && Arrays.asList(beanDefinitionNames).contains("springConfig");

        return isConditionMatched;
    }
}
