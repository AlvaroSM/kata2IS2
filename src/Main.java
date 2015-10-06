public class Main {

    public static void main(String[] args) {
        HistogramBuilder histogramBuilder = new HistogramBuilder(new Integer[] {1,4,7,1,1,8,4,1,4,9});
        Histogram histogram = histogramBuilder.build();
        HistogramViewer histogramViewer = new HistogramViewer(histogram);
        histogramViewer.view();

        HistogramBuilder histogramBuilder1 = new HistogramBuilder(new String[] {"Hola", "Hola", "eo", "eoeoe", "ao", "eo"});
        Histogram histogram1 = histogramBuilder1.build();
        HistogramViewer histogramViewer1 = new HistogramViewer(histogram1);
        histogramViewer1.view();


    }

}
