import org.example.Cadena;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CadenaTest {

    @Test

    public void devuelveInicialesTest() {
        Cadena cadena = new Cadena();
        String resultado = cadena.devuelveIniciales("Juan Carlos");
        String resultado2 = cadena.devuelveIniciales("juan carlos");
        assertEquals(resultado, "J.C.");
        assertEquals(resultado2,"J.C.");
    }

    @Test

    public void comprobarNumerosTest() {
        Cadena cadena = new Cadena();
        String resultado = String.valueOf(cadena.comprobarNumeros("22"));
        String resultado2 = String.valueOf(cadena.comprobarNumeros("Juan"));
        assertEquals(resultado, "true");
        assertEquals(resultado2, "false");
    }

}
