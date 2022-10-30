package models;

public class RegistroVacuna implements Registro{
    @Override
    public String vacunar(Persona persona) {
        System.out.println("verificando la informacion recibida");
        return "se ha registrado el dni "+persona.getDni()+ "como persona vacunada "+persona.getNombreVacuna();

    }
}
