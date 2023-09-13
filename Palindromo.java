
public class Palindromo {
    public static boolean esPalindromo(String cadena) {

        // Atributos
        String cadenaEspacios   = cadena.replaceAll("\\s+", "").toLowerCase();

        int longitud            = cadenaEspacios.length();


        for (int i = 0; i < longitud / 2; i++) {
            if (cadenaEspacios.charAt(i) != cadenaEspacios.charAt(longitud - i - 1)) {
                return false;

            }
        }
        return true;
    }
}


