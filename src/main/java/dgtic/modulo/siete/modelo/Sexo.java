package dgtic.modulo.siete.modelo;

public class Sexo {
    private String nombreSexo;

    public Sexo(String nombreSexo) {
        this.nombreSexo = nombreSexo;
    }

    public String getNombreSexo() {
        return nombreSexo;
    }

    public void setNombreSexo(String nombreSexo) {
        this.nombreSexo = nombreSexo;
    }


    @Override
    public String toString() {
        return "Sexo{" +
                ", nombreSexo='" + nombreSexo + '\'' +
                '}';
    }
}
