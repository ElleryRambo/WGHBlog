package java.com.wgh.blog.controller;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
