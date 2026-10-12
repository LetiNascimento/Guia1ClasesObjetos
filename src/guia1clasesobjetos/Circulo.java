
package guia1clasesobjetos;

public class Circulo {
    
    private double radio;
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
    public double calcularArea(){
        return Math.PI * radio * radio;
    }
    
    public double calcularCircunferencia(){
        return 2 * Math.PI * radio;
    }
    
    public void escalar(double porcentaje){
        radio = radio * (1 + porcentaje / 100);
    }
}
