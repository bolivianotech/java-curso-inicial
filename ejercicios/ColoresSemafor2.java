public class ColoresSemafor2 {
    enum EstadoSemaforo { VERDE, AMARILLO, ROJO }

    public static void main(String[] args) {
        EstadoSemaforo estado = EstadoSemaforo.ROJO;

        String mensaje = switch (estado) {
            case VERDE -> "Puedes avanzar";
            case AMARILLO -> "Preparate para detenerte";
            case ROJO -> "Detente";
        };

        System.out.println(mensaje);
    }
}