
package guia1clasesobjetos;


public class Coche {
    
    //atributos
    private String marca;
    private String modelo;
    private double kilometraje;
    private double combustibleRestante;
    
    //constante de instancia
    private final double CONSUMO_POR_KILOMETRO = 0.1;
    
    public Coche(String marca, String modelo, double kilometraje, double combustibleRestante){
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.combustibleRestante = combustibleRestante;
    }
    
    public double calcularKilometrosRestantes(){
        return combustibleRestante / CONSUMO_POR_KILOMETRO;
    }
    
    public void recargarCombustible(double cantidad){
        combustibleRestante += cantidad;
    }
    
    public void mostrarDatos(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Km: " + kilometraje);
        System.out.println("Combustible: " + combustibleRestante);
    }
    
    
}
