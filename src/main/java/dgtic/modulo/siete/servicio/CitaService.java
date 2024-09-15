package dgtic.modulo.siete.servicio;

import dgtic.modulo.siete.modelo.Cita;
import dgtic.modulo.siete.modelo.Medico;
import dgtic.modulo.siete.modelo.Paciente;

import java.util.Date;

public interface CitaService {
    Cita agendarCita(Medico medico, Paciente paciente, Date fecha);
    Cita cancelarCita(Cita cita);

}
