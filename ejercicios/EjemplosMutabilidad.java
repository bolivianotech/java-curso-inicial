public class EjemplosMutabilidad {
    public static void main(String[] args) {
        // Ejemplo con objeto inmutable (String)
        final String nombreInmutable = "Alice";
        System.out.println("Nombre original: " + nombreInmutable);
        // nombreInmutable = "Bob";  // Esto causaría un error de compilación
        // nombreInmutable.toLowerCase();  // Esto no cambia el objeto original

        // Ejemplo con objeto mutable (StringBuilder)
        final StringBuilder nombreMutable = new StringBuilder("Charlie");
        System.out.println("Nombre original: " + nombreMutable);
        
        // Podemos modificar el contenido del StringBuilder
        nombreMutable.append(" Brown");
        System.out.println("Nombre modificado: " + nombreMutable);

        // Pero no podemos asignar un nuevo objeto StringBuilder
        // nombreMutable = new StringBuilder("David");  // Esto causaría un error de compilación

        // Ejemplo con array (que es mutable)
        final int[] numeros = {1, 2, 3};
        System.out.println("Array original: " + java.util.Arrays.toString(numeros));
        
        // Podemos modificar los elementos del array
        numeros[0] = 10;
        System.out.println("Array modificado: " + java.util.Arrays.toString(numeros));

        // Pero no podemos asignar un nuevo array
        // numeros = new int[]{4, 5, 6};  // Esto causaría un error de compilación
    }
}

/*

Objetos Inmutables (ejemplo: String)
Cuando declaramos final String nombreInmutable = "Alice";, no podemos cambiar la referencia a otro objeto String.
Tampoco podemos modificar el contenido del String, porque String es inmutable en Java.
Operaciones como toLowerCase() en realidad crean un nuevo objeto String, no modifican el original.


Objetos Mutables (ejemplo: StringBuilder)
Con final StringBuilder nombreMutable = new StringBuilder("Charlie");, no podemos cambiar la referencia a otro objeto StringBuilder.
Sin embargo, podemos modificar el contenido del StringBuilder existente usando métodos como append().
La mutabilidad nos permite cambiar el estado interno del objeto sin cambiar la referencia.


Arrays (otro ejemplo de mutable)
Los arrays en Java son mutables.
Con final int[] numeros = {1, 2, 3};, no podemos reasignar numeros a un nuevo array.
Pero podemos cambiar los elementos individuales del array.

**final** en objetos previene la reasignación de la referencia.
Para objetos mutables, final no previene cambios en el estado interno del objeto.
Para objetos inmutables (como String), final efectivamente hace que el valor sea constante, ya que ni la referencia ni el contenido pueden cambiar.

Esta distinción es importante especialmente en contextos de concurrencia y diseño de API, 
donde la inmutabilidad puede proporcionar garantías de seguridad y predictibilidad. 
pero esto se podrá revisar luego con temas más avanzados de programación de APIs con Java
*/