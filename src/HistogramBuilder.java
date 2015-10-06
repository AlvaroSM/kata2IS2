import java.util.HashMap;
import java.util.Map;

public class HistogramBuilder {

    private final Object[] keys;

    public HistogramBuilder(Object[] objects) {
        this.keys = objects;
    }

    public Histogram build() {
        Map<Object, Integer> mapa = new HashMap<Object, Integer>();
        rellenarMapa(mapa);
        return new Histogram(mapa);
    }

    private void rellenarMapa(Map<Object, Integer> mapa) {
        for (Object key : keys)
            mapa.put(key, mapa.containsKey(key) ? mapa.get(key) + 1 : 1);
    }
}
