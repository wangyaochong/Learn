package Aop;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by 2 on 2016/11/7.
 */
public class CglibAop implements MethodInterceptor {
    /*动态字节码方式的AOP：
    字节码生成技术实现AOP，
    其实就是继承被代理对象，
    然后Override需要被代理的方法，
    在覆盖该方法时，
    自然是可以插入我们自己的代码的。
    因为需要Override被代理对象的方法，
    所以自然CGLIB技术实现AOP时，
    就必须要求需要被代理的方法不能是final方法，
    因为final方法不能被子类覆盖 。
     */
    Object target;
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before:"+method.getName());
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("after:"+method.getName());
        return result;
    }
    public CglibAop(Object target) {
        this.target = target;
    }

    public Object getProxyObject(){
        Enhancer e=new Enhancer();
        e.setSuperclass(this.target.getClass());
        e.setCallback(this);
        return e.create();
    }
}
