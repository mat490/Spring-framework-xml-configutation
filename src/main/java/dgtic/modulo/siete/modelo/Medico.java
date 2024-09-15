package dgtic.modulo.siete.modelo;

public class Medico implements Suscriber{
    private String cedula;
    private DatosPersonales datosPersonales;
    private Especialidad especialidad;

    public Medico( String cedula, DatosPersonales datosPersonales, Especialidad especialidad) {
        this.cedula = cedula;
        this.datosPersonales = datosPersonales;
        this.especialidad = especialidad;
    }



    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }

    public void setDatosPersonales(DatosPersonales datosPersonales) {
        this.datosPersonales = datosPersonales;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Medico:\n" +
                "Cedula: '" + cedula +
                "\nNombre: " + datosPersonales.getNombre1() +" "+datosPersonales.getApellido1() +
                "\nEspecialidad: " + especialidad.getNombreEspecialidad();
    }

    @Override
    public void update(String alert) {
        System.out.println("Estimado Dr. "+datosPersonales.getNombre()+" "+getDatosPersonales().getNombre1()+" "+alert);
    }
}
