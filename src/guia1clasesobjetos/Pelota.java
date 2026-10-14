
package guia1clasesobjetos;

/* 9. Clase Pelota:
o Define una clase Pelota con atributos marca y circunferencia.
o Implementa un método para comparar si dos pelotas tienen la misma circunferencia.
o Crea un método que permita inflar la pelota, aumentando su circunferencia en un valor dado.
*/

public class Pelota {
    private String marca;
    private double circunferencia;
    
    public Pelota(String marca, double circunferencia){
        this.marca = marca;
        this.circunferencia = circunferencia;
    }
    
    public boolean compararCircunferencias(Pelota otraPelota){
        return circunferencia == otraPelota.circunferencia;
    }
    
    public void inflarPelota(double cantidad){
        circunferencia += cantidad;
    }
    
    public double mostrarCircunferencia(){
        return circunferencia;
    }
}
