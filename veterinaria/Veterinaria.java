
package veterinaria;

import java.util.Scanner;
public class Veterinaria {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Scanner scs= new Scanner(System.in);
        int mas5anios=0;
        System.out.print("Ingrese la cantidad de Clientes a cargar: ");
        int cantidad=sc.nextInt();
        
        Cliente[] clientes= new Cliente[cantidad];
        for (int i = 0; i < clientes.length; i++) {
            System.out.print("Ingrese el número de cliente ("+ (i+1)+"):");
            int nroCliente= sc.nextInt();
            System.out.print("Ingrese el nombre del cliente ("+ (i+1)+"):");
            String nombreCliente=scs.nextLine();
            System.out.print("Ingrese la antiguedad del cliente ("+ (i+1)+"):");
            int antiguedad=sc.nextInt();
            if(antiguedad>5)
            {
                mas5anios++;
            }
            System.out.print("Nombre de la Mascota del cliente ("+ (i+1)+"):");
            String nombreMascota=scs.nextLine();
            System.out.print("Edad de la mascota del cliente ("+ (i+1)+"):");
            int edadMascota=sc.nextInt();
            System.out.println(" ");
            clientes[i]= new Cliente(nroCliente, antiguedad,edadMascota, nombreCliente, nombreMascota);
        }
//         Mostrar la cantidad de clientes
        System.out.println("La cantidad de clientes es: "+ cantidad);
//         Mostrar el promedio de edad de las mascotas.
        double promedioEdad=0;
        for (int i = 0; i < clientes.length; i++) {
            if(clientes[i] != null)
            {
                promedioEdad += clientes[i].getEdadMascota();
            }
            
        }
        System.out.println("El promedio de edad de las mascotas es de: " + promedioEdad/cantidad);
//         Informar cuántos clientes tienen una antigüedad mayor igual a 5 años. 
        System.out.println("Hay "+ mas5anios + " clientes con una antiguedad superior a los 5 años");
   
    }
    
}
