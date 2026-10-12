
package guia1clasesobjetos;


public class Rectangulo {
    
   // atributos -> estado
    private double ancho; 
    private double alto;
    
   // constructor -> inicializa el objeto
    public Rectangulo(double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
    }
    
    // Métodos -> Comportamiento
    public double calcularArea(){
        return ancho*alto;
    }
    
    public double calcularPerimetro(){
        return 2 * (ancho + alto);
    }
    
    public boolean esCuadrado(){
       return ancho == alto; 
    }
}
