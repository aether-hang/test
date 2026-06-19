package xin.aether.comtroller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @RequestMapping(value = "/touch", method = RequestMethod.GET)
    public String touch(){
        return "success";
    }
}
