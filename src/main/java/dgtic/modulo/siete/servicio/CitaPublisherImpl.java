package dgtic.modulo.siete.servicio;

import dgtic.modulo.siete.modelo.Cita;
import dgtic.modulo.siete.modelo.Suscriber;

import java.util.*;
/*Utilicé el patrón observer para poder crear notificaciones cuando se cree una cita
* o  se cancele*/
public class CitaPublisherImpl implements CitaPublisher {
    Map<Cita, List<Suscriber>> listSuscribers = new HashMap();

    public CitaPublisherImpl(){}

    @Override
    public void alert(String notification, Cita cita) {
        List<Suscriber> users = listSuscribers.get(cita);
        for(Suscriber suscriber: users){
            suscriber.update(notification);
        }
    }

    @Override
    public void unsuscribe(Cita cita) {
        listSuscribers.remove(cita);
    }

    @Override
    public void suscribe(Cita cita, Suscriber suscriber) {
        List<Suscriber> users = listSuscribers.getOrDefault(cita, new ArrayList<>());
        users.add(suscriber);
        listSuscribers.remove(cita);
        listSuscribers.put(cita, users);
    }
}
