
package banco;


public class cajaAhorro extends Cuenta{

    public cajaAhorro(int numero, String nombre, double saldo,double montoaExtraer, double montoaDepositar) {
        super(numero, nombre, saldo, montoaExtraer, montoaDepositar);
    }

    public boolean esSuficiente()
    {
        boolean esSufiente=false;
        if(saldo>montoaExtraer)
        {
            esSufiente=true;
        }
        return esSufiente;
    }
    
}
