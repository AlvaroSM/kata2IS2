import java.util.Map;

public class Histogram {

    private Map<Object, Integer> mapa;

    public Histogram(Map<Object, Integer> mapa) {
        this.mapa = mapa;
    }

    public int get(int key){
        return !mapa.containsKey(key) ? 0 : mapa.get(key);
    }

    public Object getMap() {
        return mapa;
    }
}
