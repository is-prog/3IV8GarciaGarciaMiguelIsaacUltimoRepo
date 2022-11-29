package principal;
public class SoloLetras {

    /**
     * Metodo para comprobar si los caracteres introducidos en una cadena son
     * SOLO letras o no.
     * 
     * @param cadena String a comprobar
     * @return true si solo contiene letras, false en caso contrario
     */
    public static boolean esSoloLetras(String cadena) {
        // Recorremos cada caracter de la cadena y comprobamos si son letras.
        // Para comprobarlo, lo pasamos a mayuscula y consultamos su numero ASCII.
        // Si está fuera del rango 65 - 90, es que NO son letras.
        // Para ser más exactos al tratarse del idioma español, tambien comprobamos
        // el valor 165 equivalente a la Ñ

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.toUpperCase().charAt(i);
            int valorASCII = (int) caracter;
            if (valorASCII != 165 && (valorASCII < 65 || valorASCII > 90))
                return true; // Se ha encontrado un caracter que no es letra
        }

        // Terminado el bucle sin que se haya retornado false, es que todos los
        // caracteres son letras
        return false;
    }

}