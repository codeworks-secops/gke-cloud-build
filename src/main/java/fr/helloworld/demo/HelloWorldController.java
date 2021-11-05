package fr.helloworld.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String hello() {
        System.out.println("Hello method is invoked !");
        return "Hello you !!!!!!!!!!!!";
    }

    @RequestMapping("/{name}")
    public String helloByName(@PathVariable String name) {
        System.out.println("Hello method is invoked with the name : " + name);
        return "Hello " + name + "!";
    }
}
