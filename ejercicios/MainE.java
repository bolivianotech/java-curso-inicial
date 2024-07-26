public class MainE {
    public static void main(String[] args) {
        FiguraE[] figuras = new FiguraE[4];
        figuras[0] = new CirculoE(5);
        figuras[1] = new RectanguloE(4, 6);
        figuras[2] = new TrianguloE(3, 4);
        figuras[3] = new HexagonoE(2);

        for (FiguraE figura : figuras) {
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            if (figura instanceof Dibujable) {
                ((Dibujable) figura).dibujar();
            }
            System.out.println();
        }

        GrupoFiguras grupo = new GrupoFiguras();
        for (FiguraE figura : figuras) {
            grupo.agregarFigura(figura);
        }
        System.out.println("Área total del grupo: " + grupo.calcularAreaTotal());
    }
}