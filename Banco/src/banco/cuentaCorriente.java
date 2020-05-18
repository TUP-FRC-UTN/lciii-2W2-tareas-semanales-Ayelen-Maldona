
package banco;

public class cuentaCorriente extends Cuenta{
     double acuerdo;

    public cuentaCorriente(double acuerdo, int numero, String nombre, double saldo, double montoaExtraer, double montoaDepositar) {
        super(numero, nombre, saldo, montoaExtraer, montoaDepositar);
        this.acuerdo = acuerdo;
    }

    public cuentaCorriente(double acuerdo) {
        this.acuerdo = acuerdo;
    }


    public cuentaCorriente() {
    }
    public boolean enLimite()
    {
       boolean dentrodelLimite=false;
       if(montoaExtraer>acuerdo)
       {
           dentrodelLimite=true;
       }
       return dentrodelLimite;
    }
    
    
    
    
}
