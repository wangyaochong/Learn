package Beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by 2 on 2016/10/28.
 */
public class ApplicationContextAwareTest  implements ApplicationContextAware{
    ApplicationContext applicationContext;
    Integer index;

    public ApplicationContextAwareTest() {
        
        index=new Integer(0);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
         this.applicationContext=applicationContext;
    }

}
