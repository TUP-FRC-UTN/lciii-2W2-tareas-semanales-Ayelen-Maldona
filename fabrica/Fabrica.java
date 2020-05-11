
package fabrica;

import java.util.Scanner;    
public class Fabrica {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Scanner scs= new Scanner(System.in);
        System.out.println("Ingrese el numero de productos que va a cargar");
        int tamanio=sc.nextInt();
        Producto producto= new Producto(tamanio);
        for (int i = 0; i < tamanio; i++) {
            System.out.println("Ingrese el nombre del producto: ");
            String descripcion= scs.nextLine();
            System.out.println("Ingrese la cantidad de productos: ");
            int cantidad=sc.nextInt();
            System.out.println("Ingrese el nombre del material: ");
            String descrpM=scs.nextLine();
            System.out.println("Ingrese el codigo del material: ");
            int codigo=sc.nextInt();
            System.out.println("Ingrese el valor unitario del material: ");
            float valorUnit=sc.nextFloat();
            Material[] c= new Material[tamanio];
            codigo=c[i].getCodigo();
            c[i].setDescripcion(descripcion);
            c[i].setValorUnitario(valorUnit);
            producto.agregarMaterial(c[i]);
            producto.setCantidad(cantidad);
            producto.setDescripcion(descripcion);
            
        }
    }
    
}
