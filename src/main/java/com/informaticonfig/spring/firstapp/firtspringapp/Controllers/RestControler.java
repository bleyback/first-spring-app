package com.informaticonfig.spring.firstapp.firtspringapp.Controllers;

import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/rest")
public class RestControler {
    
    @GetMapping("/info")
    public Map<String, Object> getMap(){
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Samuel");
        map.put("age", 21);
        map.put("city", "Guadalajara");
        map.put("state", "Jalisco");
        
        return map;
    }
    


}
