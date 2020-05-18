
package banco;

import java.util.Scanner;

public class Banco {

    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        Scanner scs= new Scanner(System.in);
        int numero=0;
        String nombre="";
        double saldo=0;
        double montoaExtraer=0;
        double montoaDepositar=0;
        double acuerdo=(-150);
        
  
            System.out.println("Codigo de Usuario");
           numero=sc.nextInt();
            System.out.println("Nombre del Usuario");
           nombre=scs.nextLine();
            System.out.println("Saldo Actual Total:");
           saldo=sc.nextDouble();
            System.out.println("Indeque el monto a extraer: ");
           montoaExtraer=sc.nextDouble();
            System.out.println("Indique el monto a depositar: ");
           montoaDepositar=sc.nextDouble();
        
        Cuenta b= new Cuenta(numero, nombre, saldo,montoaExtraer, montoaDepositar);
        cuentaCorriente c= new cuentaCorriente(acuerdo, numero, nombre, saldo,montoaExtraer, montoaDepositar);
        cajaAhorro a= new cajaAhorro(numero, nombre, saldo,montoaExtraer, montoaDepositar);
        if(a.esSuficiente()==true)
        {
            b.extraer();
            System.out.println("El saldo en Caja de Ahorro después de la extracción : "+ b.extraer());
        }
        else
        {
            System.out.println("Saldos insuficientes en Caja de Ahorro para la extraccion requerida.");
        } 
        if(c.enLimite()==true)
        {
            b.extraer();
            System.out.println("El saldo en Cuenta Corriente: " +b.extraer());
        }
        else
        {
            System.out.println("Saldos insuficientes en Cuenta Corriente para la extraccion requerida.");
        }
        System.out.println("El saldo en  Caja de Ahorro con Deposito: "+b.depositar());
        System.out.println("El saldo en  Cuenta Corriente con Deposito: "+b.depositar());
        if(a.esSuficiente()==true)
        {
            System.out.println("Saldo final de Caja de Ahorro: " + b.saldoFinal());
        }
        else
        {
             System.out.println("Saldo final de Caja de Ahorro: " + b.depositar());
        }
        if(c.enLimite()==true)
        {
            System.out.println("Saldo final de Cuenta Corriente: "+ b.saldoFinal());
        }
        else
        {
            System.out.println("El saldo final de Cuenta Corriente: " + b.depositar());
        }
        


    }
    
}
