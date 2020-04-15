package cn.lianhy.demo.action;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloWorld {

    @GetMapping(value = "hello")
    public String sayHello(){
        return "Hello World!";
    }
}
