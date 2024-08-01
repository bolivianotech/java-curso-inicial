public interface Evaluable {
    double evaluarDesempeño();

    default void aumentarSalario(double porcentaje) {
        System.out.println("Aumentando salario en un " + porcentaje + "%");
    }
}