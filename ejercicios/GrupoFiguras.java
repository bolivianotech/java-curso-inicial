import java.util.ArrayList;
import java.util.List;

public class GrupoFiguras {
    private List<FiguraE> figuras;

    public GrupoFiguras() {
        this.figuras = new ArrayList<>();
    }

    public void agregarFigura(FiguraE figura) {
        figuras.add(figura);
    }

    public double calcularAreaTotal() {
        double areaTotal = 0;
        for (FiguraE figura : figuras) {
            areaTotal += figura.calcularArea();
        }
        return areaTotal;
    }
}