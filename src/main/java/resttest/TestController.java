package resttest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = {"/ping"}, method = {RequestMethod.POST, RequestMethod.GET})
    public String ping() {
        return "pong";
    }

    @RequestMapping(value = {"/get"}, method = RequestMethod.GET)
    public String get() {
        return "this is just a simple get request";
    }

    @RequestMapping(value = {"/post"}, method = RequestMethod.POST)
    public String post() {
        return "this is just a simple post request";
    }

    @RequestMapping(value = {"/hi/{name}", "/greet/{name}"}, method = RequestMethod.GET)
    public String greet(@PathVariable("name") String name) {
        return "Hello, " + name + ". How are you?";
    }

    @RequestMapping(value = {"/hi", "/greet"}, method = RequestMethod.GET)
    public String greet2(@RequestParam("name") String name) {
        return "Hello, " + name + ". How are you?";
    }
}
