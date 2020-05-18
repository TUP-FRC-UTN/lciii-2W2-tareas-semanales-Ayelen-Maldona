
package banco;


public class Cuenta {
    private int numero;
    private String nombre;
    protected double saldo;
    protected double montoaExtraer;
    private double montoaDepositar;
    
    public Cuenta(int numero, String nombre, double saldo, double montoaExtraer, double montoaDepositar) {
        this.numero = numero;
        this.nombre = nombre;
        this.saldo = saldo;
        this.montoaExtraer = montoaExtraer;
        this.montoaDepositar = montoaDepositar;
    }

    public Cuenta() {

    }
    
    public double extraer()
    {
        return saldo - montoaExtraer;
    }
    public double depositar()
    {
        return saldo + montoaDepositar; 
    }
    public double saldoFinal()
    {
        return saldo + montoaDepositar - montoaExtraer;
    }
}
