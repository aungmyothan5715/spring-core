package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.expression.BeanFactoryResolver;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Main3 {

    //you can challenge this two website codewars   | leekcode for your codding skills.
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StandardEvaluationContext evaluationContext = new StandardEvaluationContext();
        evaluationContext.setBeanResolver(new BeanFactoryResolver(context));

        SpelExpressionParser parser = new SpelExpressionParser();

        System.out.println(
                parser.parseExpression("@springBean1.name")
                .getValue(evaluationContext).toString().toUpperCase()
        );

        System.out.println(
                parser.parseExpression("@springBean1.getStreetName()")
                        .getValue(evaluationContext).toString().toUpperCase()
        );



    }
}
