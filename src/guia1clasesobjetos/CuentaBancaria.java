
package guia1clasesobjetos;


public class CuentaBancaria {
    
    private double saldo;
    private String titular;
    private String numeroDeCuenta;
    
    public CuentaBancaria(double saldo, String titular, String numeroDeCuenta){
        this.saldo = saldo;
        this.titular = titular;
        this.numeroDeCuenta = numeroDeCuenta;
    }
    
    public void depositarDinero(double cantidad){
        saldo += cantidad;
    }
    
    public void retirarDinero(double cantidad){
        if (cantidad <= saldo) {
        saldo -= cantidad;
    }
    }
    
    public double consultarSaldo(){
        return saldo;
    }
        
        
        
}
    
    
    
    
    
    
    
    

