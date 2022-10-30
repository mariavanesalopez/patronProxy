package models;

import java.util.Date;

public class RegistroVacunaProxy implements Registro{
    private RegistroVacuna registro;
    @Override
    public String vacunar(Persona persona) {
        Date hoy= new Date();
        String mensaje= "vuelva cuando sea su turno. :D*";
        if(hoy.after(persona.getFechaAsignada())){
            //debe pasar al otro sector de vacucación"
            //es necesario instanciar para tener un objeto de RegistroVacuna"
            registro= new RegistroVacuna();
            mensaje= registro.vacunar(persona);


        }
        return mensaje;

    }
}
