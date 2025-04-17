package com.informaticonfig.spring.firstapp.firtspringapp.repositorios;

import java.util.List;

import com.informaticonfig.spring.firstapp.firtspringapp.Models.Productos;

public class Repo_Productos {
    List<Productos> productos;

    public Repo_Productos(){
        this.productos = List.of(
            new Productos(1L, "Producto 1", "Descripcion 1", 10.0),
            new Productos(2L, "Producto 2", "Descripcion 2", 20.0),
            new Productos(3L, "Producto 3", "Descripcion 3", 30.0)
        );
    }

    public List<Productos> getProductos() {
        return productos;
    }
    public Productos getProductoById(Long idProduct) {
        for (Productos producto : productos) {
            if (producto.getIdProduct().equals(idProduct)) {
                return producto;
            }
        }
        return null; // or throw an exception if not found
    }
    public void addProducto(Productos producto) {
        this.productos.add(producto);
    }

    public String removeProducto(Long idProduct) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getIdProduct().equals(idProduct)) {
                productos.remove(i);
                return "Producto eliminado con exito";
            }
        }
        return "Producto no encontrado";
    }
    public void updateProducto(Productos producto) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getIdProduct().equals(producto.getIdProduct())) {
                productos.set(i, producto);
                break;
            }
        }
    }
}
