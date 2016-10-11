package test.Main;

import Beans.ItemHolder;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Ê®ÔÂ 11, 2016</pre>
 */
public class MainTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: method()
     */
    @Test
    public void testMethod() throws Exception {
//TODO: Test goes here...
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object testBean = classPathXmlApplicationContext.getBean("testBean");
        System.out.println(testBean);
    }
    @Test
    public void test2xml(){
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("ItemHolderConfig.xml");
        ItemHolder bean = ctx.getBean(ItemHolder.class);
        Object itemCar = ctx.getBean("itemCar");

        System.out.println(itemCar);
        System.out.println(bean);
    }
} 
