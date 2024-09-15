package dgtic.modulo.siete.modelo;

public class Paciente implements Suscriber{
    private DatosPersonales datosPersonales;
    private EstadoCivil estadoCivil;
    private Ocupacion ocupacion;
    private  Combe combe;
    private GrupoSanguineo grupoSanguineo;
    private Rh rh;
    private LugarNacimiento lugarNacimiento;

    public Paciente(DatosPersonales datosPersonales, EstadoCivil estadoCivil, Ocupacion ocupacion,
                    Combe combe, GrupoSanguineo grupoSanguineo, Rh rh, LugarNacimiento lugarNacimiento) {
        this.datosPersonales = datosPersonales;
        this.estadoCivil = estadoCivil;
        this.ocupacion = ocupacion;
        this.combe = combe;
        this.grupoSanguineo = grupoSanguineo;
        this.rh = rh;
        this.lugarNacimiento = lugarNacimiento;
    }


    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }

    public void setDatosPersonales(DatosPersonales datosPersonales) {
        this.datosPersonales = datosPersonales;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Ocupacion getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(Ocupacion ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Combe getCombe() {
        return combe;
    }

    public void setCombe(Combe combe) {
        this.combe = combe;
    }

    public GrupoSanguineo getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(GrupoSanguineo grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public Rh getRh() {
        return rh;
    }

    public void setRh(Rh rh) {
        this.rh = rh;
    }

    public LugarNacimiento getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(LugarNacimiento lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    @Override
    public String toString() {
        return "Paciente:\n" +
                "Nombre: " + datosPersonales.getNombre1()+" "+ datosPersonales.getApellido1() +
                "\nEstado Civil: " + estadoCivil.getNombreEstadoCivil() +
                "\nOcupacion: " + ocupacion.getNombreOcupacion() +
                "\nCOMBE: " + combe.getNombreCombe() +
                "\nGrupo Sanguineo: " + grupoSanguineo.getNombreGrupoSanguineo() +
                "\nRH: " + rh.getNombreRh() +
                "\nLugar de Nacimiento: " + lugarNacimiento;
    }

    @Override
    public void update(String alert) {
        System.out.println("Estimado paciente "+datosPersonales.getNombre1()+" "+datosPersonales.getApellido1()+" "+alert);
    }
}
