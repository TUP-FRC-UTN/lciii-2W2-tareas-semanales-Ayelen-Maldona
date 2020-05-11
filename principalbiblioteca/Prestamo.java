
package principalbiblioteca;


public class Prestamo {
    private String solicitante;
    private int cantDias;
    private boolean devolucion;

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public int getCantDias() {
        return cantDias;
    }

    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }

    public boolean isDevolucion() {
        return devolucion;
    }

    public void setDevolucion(boolean devolucion) {
        this.devolucion = devolucion;
    }
    public Prestamo(String solicitante, int cantDias, boolean devolucion) {
    this.solicitante = solicitante;
    this.cantDias = cantDias;
    this.devolucion = devolucion;
    }
    
    public Prestamo()
    {}

}
