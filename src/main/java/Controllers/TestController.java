package Controllers;

import Beans.Item;
import Beans.ItemHolder;
import Beans.PrimaryBean;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by 2 on 2016/10/10.
 */
@Controller
public class TestController {

    @Resource(name = "itemCar")
    //@Autowired
    //@Qualifier("itemCar")
    Item item;

    @Resource(name = "itemFromProperty")
    //@Autowired
    //@Qualifier("itemFromProperty")
    Item itemFormProp;

    @Autowired
    PrimaryBean primaryBean;

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String sayHello() {
        System.out.println("item:" + item);
        System.out.println("scopeItemHolder:" + itemHolder);
        System.out.println("itemFromProperty:" + itemFormProp);
        System.out.println("primaryBean:"+primaryBean);
        Logger logger=Logger.getLogger(this.getClass());
        logger.info("hello log4j.");
        return "hello";
    }

    @Resource(name = "scopeItemHolder")
    ItemHolder itemHolder;

    public TestController() {
        System.out.println("itemCar:"+item);
        System.out.println("scopeItemHolder:" + itemHolder);
        System.out.println("itemFromProperty:" + itemFormProp);
    }
}
