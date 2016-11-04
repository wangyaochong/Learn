package SpEL;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

/**
 * Created by 2 on 2016/11/1.
 */
public class LearnSpEL {
    static ExpressionParser parser=null;
    static StandardEvaluationContext context=null;
    static {
        parser=new SpelExpressionParser();
        context=new StandardEvaluationContext();
    }
    public static void outputSpEL(String el){
        Expression expression=parser.parseExpression(el);
        System.out.println(expression.getValue(context));
    }
    public static void standardContext(){

        context.setVariable("hello","war");
        outputSpEL("#hello == 'war'");
    }
}
