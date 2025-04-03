package com.informaticonfig.spring.firstapp.firtspringapp.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/requestparam")
public class RequestParamController {


    @GetMapping("/detalle")
    public ParametroDTO getDetalle(@RequestParam String nombre, @RequestParam int edad) {
        ParametroDTO parametroDTO = new ParametroDTO(nombre, edad);

        return parametroDTO;
    }
    

}
