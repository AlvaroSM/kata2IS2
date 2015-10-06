import java.util.HashMap;
import java.util.Map;

public class HistogramBuilder {

    private final int[] enteros;

    public HistogramBuilder(int[] enteros) {
        this.enteros = enteros;
    }

    public Histogram build() {
        Map<Integer, Integer> mapa = new HashMap<Integer, Integer>();
        rellenarMapa(mapa);
        return new Histogram(mapa);
    }

    private void rellenarMapa(Map<Integer, Integer> mapa) {
        for (int entero : enteros) {
            if (mapa.containsKey(entero)) mapa.put(entero, mapa.get(entero)+1);
            else mapa.put(entero, 1);
        }
    }
}
