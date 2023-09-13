import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromoTest {

    @Test
    public void testCadenaVacia() {
        assertTrue(Palindromo.esPalindromo(""));
    }

    @Test
    public void testPalindromoSimple() {
        assertTrue(Palindromo.esPalindromo("oso"));
    }

    @Test
    public void testNoPalindromo() {
        assertFalse(Palindromo.esPalindromo("hola"));
    }


    @Test
    public void testPalindromoNumerico() {
        assertFalse(Palindromo.esPalindromo("12321"));
    }

    @Test
    public void testNumeroNoEsPalindromo() {
        assertFalse(Palindromo.esPalindromo("200"));
    }

    @Test
    public void testCadenaAlfanumerica() {
        assertTrue(Palindromo.esPalindromo("aaabccbaaa"));
        assertFalse(Palindromo.esPalindromo("ahabccbaaa"));
    }

    @Test
    public void testCadenaConEspacios() {
        assertTrue(Palindromo.esPalindromo("La tele letal"));
    }
}
