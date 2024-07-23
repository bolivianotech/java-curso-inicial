public class EjemplosFinal {
    // Constante a nivel de clase
    public static final int DIAS_SEMANA = 7;

    // Constante a nivel de clase (objeto inmutable)
    public static final String NOMBRE_EMPRESA = "Mi Empresa S.A.";

    public void ejemplosDeUso() {
        // Constante a nivel de método
        final double PI = 3.14159;

        // Uso de la constante
        System.out.println("Una semana tiene " + DIAS_SEMANA + " días.");
        System.out.println("El valor de PI es " + PI);

        // Ejemplo con objeto inmutable (String)
        System.out.println("Nombre de la empresa: " + NOMBRE_EMPRESA);

        // Constante con un objeto mutable (el objeto puede cambiar, pero no la referencia)
        final StringBuilder builder = new StringBuilder("Hola");
        builder.append(" Mundo"); // Esto es válido
        // builder = new StringBuilder("Adiós"); // Esto daría un error de compilación

        // Uso de 'var' para inferencia de tipos (Java 10+)
        var mensaje = "Hola Mundo"; // El tipo se infiere como String
        System.out.println(mensaje);
    }

    // Ejemplo de parámetro final en un método
    public void metodoConParametroFinal(final int numero) {
        // numero = 10; // Esto daría un error de compilación
        System.out.println("El número es: " + numero);
    }

    public static void main(String[] args) {
        EjemplosFinal ejemplo = new EjemplosFinal();
        ejemplo.ejemplosDeUso();
        ejemplo.metodoConParametroFinal(5);
    }
}

/*'final' en Java:

Se usa para declarar constantes.
Puede aplicarse a variables, métodos y clases.

Para variables primitivas, el valor no puede cambiar.
Para objetos, la referencia no puede cambiar, pero el estado del objeto sí puede (si es mutable).

La distinción entre objetos mutables e inmutables es crucial en Java, especialmente cuando se usa la palabra clave final.

Cuando decimos que un objeto es "mutable", significa que su estado interno puede cambiar después de que ha sido creado. 
Por otro lado, un objeto "inmutable" no puede cambiar su estado una vez creado.

Veamos el ejemplo de inmutabilidad con la clase EjemplosMutabilidad.class de ejemplo          continuará ........
*/