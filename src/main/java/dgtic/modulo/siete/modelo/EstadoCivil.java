package dgtic.modulo.siete.modelo;

public class EstadoCivil {
    private String nombreEstadoCivil;

    public EstadoCivil(String nombreEstadoCivil) {
        this.nombreEstadoCivil = nombreEstadoCivil;
    }

    public String getNombreEstadoCivil() {
        return nombreEstadoCivil;
    }

    public void setNombreEstadoCivil(String nombreEstadoCivil) {
        this.nombreEstadoCivil = nombreEstadoCivil;
    }


    @Override
    public String toString() {
        return "EstadoCivil{" +
                ", nombreEstadoCivil='" + nombreEstadoCivil + '\'' +
                '}';
    }
}
