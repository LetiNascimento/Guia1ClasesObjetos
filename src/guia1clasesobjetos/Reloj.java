/*
 10. Clase Reloj:
o Diseña una clase Reloj con atributos hora, minuto, y segundo.
o Implementa métodos para ajustar la hora, minuto y segundo.
o Crea un método que permita avanzar el reloj un segundo, asegurando que los valores de hora,
minuto y segundo se mantengan correctos.
 */
package guia1clasesobjetos;


public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Reloj(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    public void ajustarHora(int cantidad){
        hora = cantidad;
    }
    
    public void ajustarMinuto(int cantidad){
        minuto = cantidad;
    }
    
    public void ajustarSegundo(int cantidad){
        segundo = cantidad;
    }
    
    public void avanzarReloj(){
        segundo = segundo + 1;
        
        if (segundo == 60){
            segundo = 0;
            minuto += 1;
        }
        
        if (minuto == 60){
            minuto = 0;
            hora += 1;
        }
        
        if (hora == 24){
            hora = 0;
            minuto = 0;
            segundo = 0;
        }
    }
    
    public String mostrarHora(){
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
    
    
}
