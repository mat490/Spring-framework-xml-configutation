package dgtic.modulo.siete.modelo;

public class Especialidad {
    private String nombreEspecialidad;

    public Especialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    @Override
    public String toString() {
        return "Especialidad{" +
                ", nombreEspecialidad='" + nombreEspecialidad + '\'' +
                '}';
    }
}
