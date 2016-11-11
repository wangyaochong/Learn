package Aop.AnnotaionAop;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;

/**
 * Created by 2 on 2016/11/7.
 */
//没有@Configuration，该类就不会被spring框架扫描
//使用@Controller能够达到同样的效果
@Configuration


@EnableAspectJAutoProxy//这句代码用于启用AspectJ的aop代理
@Aspect
@Order(3)
public class AopLog {
    Logger logger=Logger.getLogger(this.getClass());

//    @Before("execution(* testAop())")
//    public void displayLogBefore(){
//        logger.info("Before testAop():log in [annotaion] Aop class");
//    }
//    @After("execution(* testAop())")
//    public void displayLogAfter(){
//        logger.info("After testAop():log in [annotaion] Aop class");
//    }

    @Around("execution(* testAop(*))")
    public Object displayLogAroundWithAnnotation(ProceedingJoinPoint j) throws Throwable {
        logger.info("[Annotation]Around before testAop():log in [annotaion] Aop class");
//        for(Object o:j.getArgs()){
//            System.out.println(o);
//        }
//        System.out.println(j.getKind());
//        System.out.println(j.getSignature());
//        System.out.println(j.getSourceLocation());
//        System.out.println(j.getStaticPart());
//        System.out.println(j.getTarget());
//        System.out.println(j.getThis());
//        System.out.println(j.getClass());
        String proceed = (String) j.proceed();
        logger.info("[Annotation]Around end testAop():log in [annotaion] Aop class");
        return proceed+"---Around";
    }

    public Object displayLogAroundWithXmlConfig(ProceedingJoinPoint j) throws Throwable {
        logger.info("[XmlConfiguration]Around before testAop():log in [annotaion] Aop class");
        String proceed = (String) j.proceed();
        logger.info("[XmlConfiguration]Around end testAop():log in [annotaion] Aop class");
        return proceed+"---Around";
    }
}
