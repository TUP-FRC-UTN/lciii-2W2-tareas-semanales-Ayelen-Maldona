
package fabrica;


public class Producto {
    
    private String descripcion;
    private int cantidad;
    private Material[] materiales;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Producto(int tamanio)
    {
        materiales= new Material[tamanio];
    }
    public void agregarMaterial(Material material)
    {
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i]==null)
            {
                materiales[i]= material;
                break;
            }
            
        }
    }
    public double obtenerCostoTotal()
    {
        double costoTotal=0;
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i]!=null)
            {
                costoTotal += materiales[i].getValorUnitario();
            }
            
        }
        return costoTotal;
    }
    public boolean formaParteProd()//Material codigo//)
    {
        boolean formaParte=false;
        int Codigo=1;
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i]!=null && materiales[i].getCodigo()== Codigo)
            {
                formaParte=true;
                break;
            }
            
        }
        return formaParte;
    }
    public void Producto(Material esMenor)
    {
        double menorQue=0;
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i]!= null && materiales[i].getValorUnitario()<menorQue)
            {
                materiales[i]= esMenor;
            }
            
        }
    }



    
}
