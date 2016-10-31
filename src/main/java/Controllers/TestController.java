package Controllers;

import Beans.Item;
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
    Item item;

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String sayHello(){
        System.out.println("item:"+item);
        return "hello";
    }
}
