package dgtic.modulo.siete.modelo;

public class GrupoSanguineo {
    private String nombreGrupoSanguineo;

    public GrupoSanguineo(String nombreGrupoSanguineo) {
        this.nombreGrupoSanguineo = nombreGrupoSanguineo;
    }

    public String getNombreGrupoSanguineo() {
        return nombreGrupoSanguineo;
    }

    public void setNombreGrupoSanguineo(String nombreGrupoSanguineo) {
        this.nombreGrupoSanguineo = nombreGrupoSanguineo;
    }

    @Override
    public String toString() {
        return "GrupoSanguineo{" +
                ", nombreGrupoSanguineo='" + nombreGrupoSanguineo + '\'' +
                '}';
    }
}
