public class EjemploBooleanos {
    // Variable de instancia (atributo de clase)
    boolean estaActivo;

    public void imprimirEstado() {
        System.out.println("¿Está activo? " + estaActivo);
    }

    public void activar() {
        estaActivo = true;
    }

    public void ejemploVariableLocal() {
        // Variable local
        boolean tienePermiso = false;
        System.out.println("¿Tiene permiso? " + tienePermiso);
        
        // Cambiando el valor de la variable local
        tienePermiso = true;
        System.out.println("¿Tiene permiso ahora? " + tienePermiso);
    }

    public static void main(String[] args) {
        EjemploBooleanos ejemplo = new EjemploBooleanos();

        // Mostrando el valor por defecto de la variable de instancia
        System.out.println("Estado inicial:");
        ejemplo.imprimirEstado();

        // Cambiando el estado
        ejemplo.activar();
        System.out.println("\nDespués de activar:");
        ejemplo.imprimirEstado();

        // Ejemplo con variable local
        System.out.println("\nEjemplo con variable local:");
        ejemplo.ejemploVariableLocal();

        // Ejemplo con array de booleanos
        boolean[] estados = new boolean[3];
        System.out.println("\nValores iniciales del array de booleanos:");
        for (int i = 0; i < estados.length; i++) {
            System.out.println("Estado " + i + ": " + estados[i]);
        }

        // Cambiando un valor en el array
        estados[1] = true;
        System.out.println("\nDespués de cambiar el segundo elemento:");
        for (int i = 0; i < estados.length; i++) {
            System.out.println("Estado " + i + ": " + estados[i]);
        }
    }
}