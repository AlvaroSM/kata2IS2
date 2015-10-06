import java.util.HashMap;
import java.util.Map;

public class HistogramBuilder <T> {

    private final Object[] enteros;

    public HistogramBuilder(Object[] objects) {
        this.enteros = objects;
    }

    public Histogram build() {
        Map<Object, Integer> mapa = new HashMap<Object, Integer>();
        rellenarMapa(mapa);
        return new Histogram(mapa);
    }

    private void rellenarMapa(Map<Object, Integer> mapa) {
        for (Object entero : enteros) {
            if (mapa.containsKey(entero)) mapa.put(entero, mapa.get(entero)+1);
            else mapa.put(entero, 1);
        }
    }
}
