package test.Main;

import Aop.AopImplements.CglibAop;
import Aop.AopImplements.SimpleBeanImpl;
import Aop.AopImplements.SimpleBeanInterface;
import Aop.AopImplements.SimpleBeanProxy;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * Created by 2 on 2016/11/4.
 */
public class TestSimpleBeanProxy {
    @Test
    public void testSimpleBeanProxy(){
        SimpleBeanProxy simpleBeanProxy=new SimpleBeanProxy(new SimpleBeanImpl());
        SimpleBeanInterface simpleBeanDifferent =(SimpleBeanInterface) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), SimpleBeanImpl.class.getInterfaces(),simpleBeanProxy);
        simpleBeanDifferent.sayHello("wangyaochong");
    }
    @Test
    public void testCglibAop(){
        CglibAop cglibAop=new CglibAop(new SimpleBeanImpl());
        SimpleBeanInterface proxyObject = (SimpleBeanInterface) cglibAop.getProxyObject();
        proxyObject.sayHello("wangyaochong");
    }
}
