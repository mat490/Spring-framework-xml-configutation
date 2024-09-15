package dgtic.modulo.siete.modelo;

public class Rh {
    private String nombreRh;

    public Rh(String nombreRh) {
        this.nombreRh = nombreRh;
    }

    public String getNombreRh() {
        return nombreRh;
    }

    public void setNombreRh(String nombreRh) {
        this.nombreRh = nombreRh;
    }

    @Override
    public String toString() {
        return "Rh{" +
                ", nombreRh='" + nombreRh + '\'' +
                '}';
    }
}
