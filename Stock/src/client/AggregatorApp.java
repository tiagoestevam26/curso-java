package client;

import java.io.IOException;

import aggregators.AggregatorProcessor;
import aggregators.MaxAggregator;
import aggregators.MeanAggregator;
import aggregators.MinAggregator;

public class AggregatorApp {

    public static void main(String[] args) throws IOException {

        MinAggregator agg = new MinAggregator();
        AggregatorProcessor<MinAggregator> aggsProcessor = new AggregatorProcessor<>(agg, "src/table.csv");
        double value = aggsProcessor.runAggregator(0);
        System.out.println(value);


    }

}
