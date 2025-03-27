package com.informaticonfig.spring.firstapp.firtspringapp.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class EjemploController {
    @GetMapping("/home")
    public String holaMundo() {
        return "home";
    }
}
