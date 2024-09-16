package org.example.condition;

import org.example.annotation.ConditionalTestAnnotation;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @author dibyendu.debnath
 * @since 9/16/24
 */
public class AnnotationCheckCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        boolean isConditionalTestAnnotationAnnotated = metadata.isAnnotated(ConditionalTestAnnotation.class.getName());
        Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes(ConditionalTestAnnotation.class.getName());

        return isConditionalTestAnnotationAnnotated && yesNoMap((String) annotationAttributes.get("create"));
    }

    private boolean yesNoMap(String value) {
        if ("yes".equals(value)) {
            return true;
        }

        return false;
    }
}
