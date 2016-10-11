package test.Main; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
* Main Tester. 
* 
* @author <Authors name> 
* @since <pre>Ê®ÔÂ 11, 2016</pre> 
* @version 1.0 
*/ 
public class MainTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: method() 
* 
*/ 
@Test
public void testMethod() throws Exception { 
//TODO: Test goes here...
    ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    Object testBean = classPathXmlApplicationContext.getBean("testBean");
    System.out.println(testBean);
} 


} 
