package Aop.AnnotaionAop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;

/**
 * Created by 2 on 2016/11/7.
 */
//没有@Configuration，该类就不会被spring框架扫描
//使用@Controller能够达到同样的效果
@Configuration


@EnableAspectJAutoProxy//这句代码用于启用AspectJ的aop代理
@Aspect
public class AopLogForAnnotaion {
    Logger logger=Logger.getLogger(this.getClass());

//    @Before("execution(* testAop())")
//    public void displayLogBefore(){
//        logger.info("Before testAop():log in [annotaion] Aop class");
//    }
//    @After("execution(* testAop())")
//    public void displayLogAfter(){
//        logger.info("After testAop():log in [annotaion] Aop class");
//    }

    @Around("execution(* testAop())")
    public Object displayLogAround(ProceedingJoinPoint j) throws Throwable {
        logger.info("Around before testAop():log in [annotaion] Aop class");
        String proceed = (String) j.proceed();
        logger.info("Around end testAop():log in [annotaion] Aop class");
        return proceed+"---Around";
    }


}
