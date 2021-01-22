package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class testManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        
        //Insertando un nuevo objeto de tipo Persona
        //Persona personaNueva = new Persona("Lourdes","Molina","lmolina@mail.com","666111000");
        //personaDao.insertar(personaNueva);
        
        //Modificar un objeto de persona existente
        //Persona personaModificar = new Persona (3, "Lorena","Gomez","lgomez@mail.com","655344122");
        //personaDao.actualizar(personaModificar);
        
        //Eliminar un registro
        Persona personaEliminar = new Persona(2);
        personaDao.eliminar(personaEliminar);
        
        //Con esto ejecutamos la consulta para ver los resultados que nos devuelve la base de datos
        List<Persona> personas = personaDao.seleccionar();
        for(Persona persona: personas){
            System.out.println("persona = "+persona);
        }
    }
}
