package bo.edu.uap.utils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JsonProcessingException
    {
        System.out.println( "Convirtiendo objeto a Json" );
        Persona persona = new Persona();
        persona.setNombre("Juan Guzman");
        persona.setEdad(34);
        ObjectMapper om = new ObjectMapper();
        String stringobject = om.writeValueAsString(persona);
        System.out.print(stringobject);
    }
}
