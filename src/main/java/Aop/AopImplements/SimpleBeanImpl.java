package Aop.AopImplements;

/**
 * Created by 2 on 2016/11/4.
 */
public class SimpleBeanImpl implements  SimpleBeanInterface{
    public void sayHello(String name){
        System.out.println("hello:"+name);
    }
}
