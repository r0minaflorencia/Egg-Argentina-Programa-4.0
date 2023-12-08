package app.datos_persona;

import app.datos_persona.entidades.Persona;
import app.datos_persona.servicios.PersonaService;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {
      
        System.out.println(" /// Welcome /// ");
        PersonaService serviceClass = new PersonaService();
        
        //crear
        Persona persona = serviceClass.crear();
        
        //calcular edad
        int edad = serviceClass.calcularEdad(persona);
        
        //calcular mayoría de edad
        System.out.println(serviceClass.validarMayoriaDeEdad(persona, edad));
        
        //mostrar datos
        serviceClass.mostrarPersona(persona);
        
        
    }
}
