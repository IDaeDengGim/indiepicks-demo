package IDaeDengGim.indiepicks_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {
    @GetMapping("/")
    @ResponseBody
    String page(){
        return "서버 연결~~~~~";
    }
}
