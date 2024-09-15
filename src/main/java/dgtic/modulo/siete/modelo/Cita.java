package dgtic.modulo.siete.modelo;

import java.util.Date;

public class Cita {
    private Date fechaCita;
    private Paciente paciente;
    private Medico medico;

    public Cita(Date fechaCita, Paciente paciente, Medico medico) {
        this.fechaCita = fechaCita;
        this.paciente = paciente;
        this.medico = medico;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "fechaCita=" + fechaCita +
                ", paciente=" + paciente +
                ", medico=" + medico +
                '}';
    }
}
