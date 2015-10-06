public class Main {

    public static void main(String[] args) {
        HistogramBuilder histogramBuilder = new HistogramBuilder(new int[] {1,4,7,1,1,8,4,1,4,9});
        Histogram histogram = histogramBuilder.build();
        histogram.printHistogram();
        System.out.println(histogram.get(3));
    }

}
