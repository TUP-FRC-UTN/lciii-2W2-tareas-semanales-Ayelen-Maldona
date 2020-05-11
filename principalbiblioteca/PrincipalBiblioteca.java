
package principalbiblioteca;

import java.util.Scanner;
public class PrincipalBiblioteca {

   
   public static void main(String[] args){
   principal();
   }

    public static void principal(){
        Scanner sc= new Scanner(System.in);
        Scanner scs= new Scanner(System.in);
        String solicitante="";
        int cantDias=0;
        boolean devolucion=false;
        double prReposicion=0;
        int estado=0;
        String titulo="";
        System.out.println("Determine la cantidad de libros que va a cargar");
        int tamanio=sc.nextInt();
        Biblioteca a= new Biblioteca(tamanio);
        for (int i = 0; i < tamanio; i++) {
//            b[i].getSolicitante();
            System.out.println("Ingrese el titulo del Libro: ");
            titulo= scs.nextLine();
            System.out.println("Ingrese el precio de Reposicion: ");
            prReposicion= sc.nextDouble();
            System.out.println("Ingrese el Estado en que se encuentra el libro: ");
            estado=sc.nextInt();
            System.out.println("Ingrese el nombre del Solicitante: ");
            solicitante= scs.nextLine();
            System.out.println("Ingrese la cantidad de Dias que dura el prestamo: ");
            cantDias=sc.nextInt();
            System.out.println("El libro fue devuelto: ");
            devolucion=sc.nextBoolean();     
        }
        Prestamo b= new Prestamo();
            b.setSolicitante(solicitante);
            b.setCantDias(cantDias);
            b.setDevolucion(devolucion);

           
        Libro c= new Libro(tamanio);
        for (int i = 0; i < tamanio; i++) {
            c.setEstado(estado);
            c.setTitulo(titulo);
            c.setPrReposicion(prReposicion);
            c.agregarPrestamo(b);
            a.agregarLibro(c);
        }
            
          System.out.println(titulo + prReposicion + estado + solicitante + cantDias + devolucion );
          

        
          
    }

}
