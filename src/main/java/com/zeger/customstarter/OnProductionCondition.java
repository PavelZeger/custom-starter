package com.zeger.customstarter;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import javax.swing.*;

/**
 * @author Pavel Zeger
 * @implNote custom-starter
 * @since 03/04/2021
 */
public class OnProductionCondition implements Condition {

    public static Boolean enabled;


    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        if (enabled == null) {
            String answer = JOptionPane.showInputDialog("Is this production");
            enabled = answer.toLowerCase().contains("y");
        }
        return enabled;
    }
}
