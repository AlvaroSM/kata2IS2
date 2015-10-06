import java.util.Map;

public class Histogram {

    private Map<Integer, Integer> mapa;

    public Histogram(Map<Integer, Integer> mapa) {
        this.mapa = mapa;
    }

    public void printHistogram(){
        for (Integer entero : mapa.keySet()) {
            System.out.println(entero + ":" + mapa.get(entero) + " veces");
        }
    }

    public int get(int key){
        return !mapa.containsKey(key) ? 0 : mapa.get(key);
    }

}
