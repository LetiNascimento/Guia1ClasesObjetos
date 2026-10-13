
package guia1clasesobjetos;


public class Termometro {
    
    private double temperatura;
    
    public Termometro(double temperatura){
        this.temperatura = temperatura;
    }
    
    public double converterACelsius(){
        return (temperatura - 32) / 1.8; 
    }
    
    public double converterAFahren(){
        return (temperatura * 1.8) + 32;
    }
    
    public void aumentarTemperatura(double cantidad){
        temperatura += cantidad;
    }
    
    public void bajarTemperatura(double cantidad){
        temperatura -= cantidad;
    }
    
    public double mostrarTemperatura(){
        return temperatura;
    }
}
