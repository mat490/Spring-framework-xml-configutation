package dgtic.modulo.siete.servicio;

import dgtic.modulo.siete.modelo.Cita;
import dgtic.modulo.siete.modelo.Suscriber;

public interface CitaPublisher {
    void alert(String notification, Cita cita);
    void unsuscribe(Cita cita);
    void suscribe(Cita cita, Suscriber suscriber);
}
