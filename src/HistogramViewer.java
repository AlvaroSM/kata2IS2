import java.util.Map;

public class HistogramViewer {

    private final Histogram histogram;

    public HistogramViewer(Histogram histogram) {
        this.histogram = histogram;
    }

    public void view(){
        Map<Object, Integer> mapa = (Map<Object, Integer>) histogram.getMap();
        for (Object key : mapa.keySet())
            System.out.println(key + ":" + mapa.get(key) + " veces");
    }
}
