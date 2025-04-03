package com.informaticonfig.spring.firstapp.firtspringapp.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.informaticonfig.spring.firstapp.firtspringapp.Models.Empleados;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@RestController
@RequestMapping("/rest")
public class RestControler {
    
    @RequestMapping(path="/info", method=RequestMethod.GET)
    public Map<String, Object> getMap(){
        // Crear un objeto de la clase Empleados y agregarlo a un mapa
        Empleados empleado = new Empleados("Samuel", "Godoy", "Backend Developer", 21, 1, 10000);
        Map<String, Object> map = new HashMap<>();
        map.put("Empleado", empleado);
        
        return map;
    }
    


}
