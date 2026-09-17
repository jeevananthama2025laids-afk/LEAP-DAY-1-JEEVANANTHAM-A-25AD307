package _2._3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("hello")
    public String get() {
        return "hello world";
    }

    @PostMapping("create")
    public String create(@RequestBody String payload) {
        return payload + " successfully created";
    }
}
