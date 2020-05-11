
package principalbiblioteca;


public class Biblioteca {
    private Libro[] libros;
    
    public Biblioteca(int tamanio)
    {
        libros= new Libro[tamanio];
    }
    public void agregarLibro(Libro libro)
    {
        for (int i = 0; i < libros.length; i++) {
            if(libros[i] == null)
            {
                libros[i]=libro;
                break;
            }
            
        }
    }
    public int estadoLibros()
    {
        int estado=0;
        for (int i = 0; i < libros.length; i++) {
            if(libros[i]!= null)
            {
                estado= libros[i].getEstado();
            }
            
        }
        return estado;
    }
     public int[] librosxestado()
    {
        int cantidadEstado[] = new int[3];
        for (int i = 0; i < libros.length; i++) {
            if(libros[i] != null)
            {
                switch(libros[i].getEstado())
                {
                    case 1: 
                    {
                        cantidadEstado[1]++;
                        break;
                    }
                    case 2:
                    {
                        cantidadEstado[2]++;
                        break;
                    }
                    case 3:
                    {
                        cantidadEstado[3]++;
                        break;
                    }
                }
            }
            
        }
        return cantidadEstado;
    }

    public double promedioPrestamos()
    {
        int cantLibros=0;
        int promedio=0;
        for (int i = 0; i < libros.length; i++) {
            if(libros[i] != null)
            {
                cantLibros++;
            }
            
        }
        promedio=libros[0].cantidadPrestamos()/cantLibros;
        return promedio;
    }
    public double precioExtraviados()
    {
        double precioExtraviados=0;
        for (int i = 0; i < libros.length; i++) {
            if(libros[i]!= null && libros[i].getEstado()== 3)
            {
                precioExtraviados += libros[i].getPrReposicion();
            }
            
        }
        return precioExtraviados;
    }
    public String solicitLibro()
    {
        String nombreDelLibro="";
        String SolicitanElMismoLibro="";
        for (int i = 0; i < libros.length; i++) {
            if(libros[i]!=null && libros[i].getTitulo()== nombreDelLibro)
            {
                SolicitanElMismoLibro = libros[i].listadoSolicitantes();
            }
            
        }
        return SolicitanElMismoLibro;
    }
}
