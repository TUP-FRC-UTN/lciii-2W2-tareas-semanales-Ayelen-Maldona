
package principalbiblioteca;


public class Libro {
    private String titulo;
    private double prReposicion;
    private int estado;
    private Prestamo[] prestamos;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPrReposicion(double prReposicion) {
        this.prReposicion = prReposicion;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    public Libro(int tamanio)
    {
        prestamos= new Prestamo[tamanio];
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrReposicion() {
        return prReposicion;
    }

    public int getEstado() {
        return estado;
    }

    public Prestamo[] getPrestamos() {
        return prestamos;
    }
    
    public void agregarPrestamo(Prestamo prestamo)
    {
        for (int i = 0; i < prestamos.length; i++) {
            if(prestamos[i]== null)
            {
                prestamos[i]=prestamo;
                break;
            }
            
        }
    }
//        public boolean estaDevuelto()
//    {
//        boolean devuelto= false;
//        for (int i = 0; i < prestamos.length; i++) {
//            if(prestamos[i]!= null && prestamos[i].isDevolucion()==true)
//            {
//                    devuelto=true;
//                    break;
//            }
//            
//        }
//        return devuelto;
//    }
    public String listadoSolicitantes()
    {
        String nombreSolicitante="";
        for (int i = 0; i < prestamos.length; i++) {
            if(prestamos[i] != null)
            {
                nombreSolicitante = prestamos[i].getSolicitante();
            }
            
        }
        return nombreSolicitante;
    }
    public int cantidadPrestamos()
    {
        int cantidad=0;
        for (int i = 0; i < prestamos.length; i++) {
            if(prestamos[i]!= null)
            {
                cantidad++;
            }
            
        }
        return cantidad;
    }
    
}
