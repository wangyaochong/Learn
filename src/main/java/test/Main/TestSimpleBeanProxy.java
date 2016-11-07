package test.Main;

import Aop.CglibAop;
import Aop.SimpleBeanImpl;
import Aop.SimpleBeanInterface;
import Aop.SimpleBeanProxy;
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
