package dgtic.modulo.siete.modelo;

public class Ocupacion {
    private String nombreOcupacion;

    public Ocupacion(String nombreOcupacion) {
        this.nombreOcupacion = nombreOcupacion;
    }

    public String getNombreOcupacion() {
        return nombreOcupacion;
    }

    public void setNombreOcupacion(String nombreOcupacion) {
        this.nombreOcupacion = nombreOcupacion;
    }

    @Override
    public String toString() {
        return "Ocupacion{" +
                ", nombreOcupacion='" + nombreOcupacion + '\'' +
                '}';
    }
}
