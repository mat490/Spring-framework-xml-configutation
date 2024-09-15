package dgtic.modulo.siete.servicio;

import dgtic.modulo.siete.modelo.Cita;
import dgtic.modulo.siete.modelo.Medico;
import dgtic.modulo.siete.modelo.Paciente;

import java.util.Date;

public class CitaServiceImpl implements CitaService{
    private CitaPublisher citaPublisher;


    public CitaServiceImpl(CitaPublisher citaPublisher){
        this.citaPublisher = citaPublisher;
    }

    @Override
    public Cita agendarCita(Medico medico, Paciente paciente, Date fecha) {
        try {
            Cita nuevaCita = new Cita(fecha, paciente, medico);
            citaPublisher.suscribe(nuevaCita,paciente);
            citaPublisher.suscribe(nuevaCita,medico);
            citaPublisher.alert("se ha creado una cita para la fecha "+fecha, nuevaCita);
            return nuevaCita;
        } catch (Exception e){
            throw e;
        }

    }

    @Override
    public Cita cancelarCita(Cita cita) {
        citaPublisher.alert("se ha eliminado la cita de la fecha "+cita.getFechaCita(), cita);
        citaPublisher.unsuscribe(cita);
        return null;



    }
}
