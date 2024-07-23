public class ComparacionStrings {
    public static void main(String[] args) {
        // Creando Strings de diferentes maneras
        String str1 = "hola";
        String str2 = "hola";
        String str3 = new String("hola");

        // Comparando con ==
        System.out.println("Usando ==:");
        System.out.println("str1 == str2: " + (str1 == str2));       // true
        System.out.println("str1 == str3: " + (str1 == str3));       // false
                    /*Comparamos las referencias de los objetos, es decir, si son exactamente el mismo objeto en memoria.
                    Para Strings, '==' dará true solo si ambas variables apuntan al mismo objeto String en memoria. */

        // Comparando con .equals()
        System.out.println("\nUsando .equals():");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true
                    /*Comparamos el contenido de los objetos.
                    Para Strings, '.equals()' dará true si los Strings tienen exactamente los mismos caracteres. */

        // Demostración adicional y regla práctica:
                    /*Usa '==' para tipos primitivos (int, boolean, etc.).
                    Usa '.equals()' para objetos, especialmente Strings, cuando quieras comparar su contenido. */

        String str4 = "Hola";
        System.out.println("\nComparando 'hola' con 'Hola':");
        System.out.println("str1 == str4: " + (str1 == str4));         // false
        System.out.println("str1.equals(str4): " + str1.equals(str4)); // false
        System.out.println("str1.equalsIgnoreCase(str4): " + str1.equalsIgnoreCase(str4)); // true
    }
}

/*Nota adicional:

'.equalsIgnoreCase()' compara Strings ignorando mayúsculas y minúsculas.

Esta distinción es crucial en Java, especialmente cuando trabajas con Strings y 
otros objetos. Usar '==' cuando deberías usar '.equals()' es un error común 
que puede llevar a comportamientos inesperados en tu programa. */