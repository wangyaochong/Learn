package Aop.AopImplements;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by 2 on 2016/11/4.
 */
public class SimpleBeanProxy implements InvocationHandler{
    /*JDK动态代理方式的AOP：
    主要使用到 InvocationHandler 接口和 Proxy.newProxyInstance() 方法。
    JDK动态代理要求被代理实现一个接口，只有接口中的方法才能够被代理 。
    其方法是将被代理对象注入到一个中间对象，
    而中间对象实现InvocationHandler接口，
    在实现该接口时，可以在被代理对象调用它的方法时，
    在调用的前后插入一些代码。
    而 Proxy.newProxyInstance() 能够利用中间对象来生产代理对象。
    插入的代码就是切面代码。
     */
    Object target;

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("before:" + method.getName());
        Object result = method.invoke(target, args);
        System.out.println("after:" + method.getName());

        return result;
    }

    public SimpleBeanProxy(Object target) {
        this.target = target;
    }
}
