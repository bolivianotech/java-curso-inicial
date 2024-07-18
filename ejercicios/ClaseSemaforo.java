public class ClaseSemaforo {
    enum EstadoSemaforo { VERDE, AMARILLO, ROJO }

    public static void main(String[] args) {
        EstadoSemaforo estado = EstadoSemaforo.ROJO;

        switch (estado) {
            case VERDE:
                System.out.println("Puedes avanzar");
                break;
            case AMARILLO:
                System.out.println("Preparate para detenerte");
                break;
            case ROJO:
                System.out.println("Detente");
                break;
        }
    }
}