package com.informaticonfig.spring.firstapp.firtspringapp.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.informaticonfig.spring.firstapp.firtspringapp.Models.Productos;
import com.informaticonfig.spring.firstapp.firtspringapp.services.Services_Producto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
;



@RestController
@RequestMapping("/productos")
public class Product_Controller {
    private Services_Producto repoProductos = new Services_Producto();

    @GetMapping("/all")
    public List<Productos> getProductos() {

        return repoProductos.getProductos();
    }


    @GetMapping("/{idProduct}")
    public Productos getProductoById(@PathVariable Long idProduct) {
        return repoProductos.getProductoById(idProduct);
    }
   
    @PostMapping("/add")
    public String addProducto(@RequestBody Long idProduct, @RequestBody String nombre, @RequestBody String descripcion, @RequestBody double precio) {
        Productos producto = new Productos(idProduct, nombre, descripcion, precio);
        repoProductos.addProducto(producto);
        return "Producto agregado con exito";
    }
    @PostMapping("/delete/{idProduct}")
    public String deleteProduct(@PathVariable Long idProduct) {
        repoProductos.removeProducto(idProduct);
        return "Producto eliminado con exito";
    }
    

}
