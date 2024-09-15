package dgtic.modulo.siete.inicio;

import dgtic.modulo.siete.modelo.*;
import dgtic.modulo.siete.servicio.CitaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.Instant;
import java.util.Date;

public class medicInicio {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{
                        "bean-configuration.xml",
                        "bean-services.xml"
                }
        );
        // Cambiar los valores de los beans del paciente y doctor
        System.out.println("------- Cambiamos valores de los beans del paciente y el doctor -------");
        // Llamamos los beans
        Medico medico1 = context.getBean("medicoUno", Medico.class);
        Paciente paciente = context.getBean("pacienteUno", Paciente.class);
        System.out.println(medico1+"\n\n"+paciente);

        System.out.println("<<<<<<<<<< Cambiamos a la especialidad de pediatría y la ocupación del paciente a Pogramador >>>>>>>>>>");
        // Modificamos una propiedad utilizando otro bean
        Especialidad especialidadPediatra = context.getBean("especialidadPediatra", Especialidad.class);
        medico1.setEspecialidad(especialidadPediatra);
        System.out.println(medico1+"\n\n"+paciente);
        System.out.println("---------------------------------------------------------------------");

        // Usamos el servicio para crear una cita
        CitaService citaService = context.getBean("citaService", CitaService.class);
        // El servicio CItaPublisher hará el trabajo de notificar al paciente y doctor cuando se agenda una cita
        // por medio del patrón observer
        Cita cita = citaService.agendarCita(medico1, paciente, Date.from(Instant.now()));
        System.out.println("#########");
        cita = citaService.cancelarCita(cita);
        // La cita es nula despues de borrarla
        System.out.println(cita);

        ((ClassPathXmlApplicationContext)context).close();
    }


}
