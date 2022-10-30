package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class RegistroVacunaProxyTest {
    @Test
    public void vacunarPersonaCorrecta(){
        //Given
        Persona persona= new Persona("juan","perez",12578963,"pfizer",new Date(2022-1900,10-1,30));
        Registro registro= new RegistroVacunaProxy();
        String respuestaEsperada= "se ha registrado el dni 12578963como persona vacunada pfizer";
        //When
        String respuesta= registro.vacunar(persona);
        //Then
        Assertions.assertEquals(respuestaEsperada,respuesta);
    }

}
