
package veterinaria;


public class Cliente {
    private int nroCliente, antiguedad, edadMascota;
    private String nombreCliente, nombreMascota;

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getEdadMascota() {
        return edadMascota;
    }

    public void setEdadMascota(int edadMascota) {
        this.edadMascota = edadMascota;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }
    public Cliente()
    {}

    public Cliente(int nroCliente, int antiguedad, int edadMascota, String nombreCliente, String nombreMascota) {
        this.nroCliente = nroCliente;
        this.antiguedad = antiguedad;
        this.edadMascota = edadMascota;
        this.nombreCliente = nombreCliente;
        this.nombreMascota = nombreMascota;
    }
    
}
