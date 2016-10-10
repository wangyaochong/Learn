package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 2 on 2016/10/10.
 */
@Controller
public class TestController {
    @RequestMapping(value = "/hello")
    @ResponseBody
    public String sayHello(){
        return "hello";
    }
}
