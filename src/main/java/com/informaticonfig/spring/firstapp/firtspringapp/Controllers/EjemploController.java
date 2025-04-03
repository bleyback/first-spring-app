package com.informaticonfig.spring.firstapp.firtspringapp.Controllers;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.informaticonfig.spring.firstapp.firtspringapp.Models.Empleados;



@Controller
public class EjemploController {
    @GetMapping("/home")
    public String holaMundo(Model model) {
        model.addAttribute("empleados", EmpleadosList());
        return "home";
    }

    @ModelAttribute("Empleados")
    public List<Empleados> EmpleadosList() {
        Empleados empleado1 = new Empleados("Juan", "Pérez", "Gerente", 30, 1, 50000.0);
        Empleados empleado2 = new Empleados("Ana", "Gómez", "Desarrolladora", 25, 2, 40000.0);
        Empleados empleado3 = new Empleados("Luis", "Martínez", "Diseñador", 28, 3, 45000.0);

        return List.of(empleado1, empleado2, empleado3);
        
    }
}
