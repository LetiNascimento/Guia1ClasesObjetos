
package guia1clasesobjetos;

/*
Clase Producto:
o Desarrolla una clase Producto con atributos nombre, precio, y cantidadEnStock.
o Crea un método para aplicar un descuento al precio del producto.
o Implementa un método para realizar una venta, actualizando la cantidad en stock y verificando
que haya suficiente stock disponible.

*/
public class Producto {
    private String nombre;
    private double precio;
    private double cantidadEnStock;
    
    public Producto(String nombre, double precio, double cantidadEnStock){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
        
    }
    
    public void aplicarDescuento(double cantidad){
        precio -= (cantidad / 100) * precio;
    }
    
    public void venderProducto(double cantidad){
        if (cantidad <= cantidadEnStock){
            cantidadEnStock -= cantidad;
        }
    }
    
    public double mostrarPrecio(){
       return precio;
    }
    
    public double mostrarStock(){
        return cantidadEnStock;
    }
}
