package dgtic.modulo.siete.modelo;

public class Combe {
    private String nombreCombe;

    public Combe(String nombreCombe) {
        this.nombreCombe = nombreCombe;
    }

    public String getNombreCombe() {
        return nombreCombe;
    }

    public void setNombreCombe(String nombreCombe) {
        this.nombreCombe = nombreCombe;
    }

    @Override
    public String toString() {
        return "Combe{" +
                ", nombreCombe='" + nombreCombe + '\'' +
                '}';
    }
}
