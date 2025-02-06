package aggregators;

import fileprocessors.StockFileReader;

import java.io.*;
import java.util.*;

public class AggregatorProcessor<T extends Aggregator> {
    private T aggregator;
    private String filePath;

    public AggregatorProcessor(T aggregator, String filePath) {
        this.aggregator = aggregator;
        this.filePath = filePath;
    }

    public double runAggregator(int columnIndex) throws IOException {

        StockFileReader fr = new StockFileReader(filePath);
        List<String> lines = new LinkedList<>();
        lines = fr.readFileData();

        ArrayList<Object> collum = new ArrayList<>();

        for (String line : lines) {
            String [] lineArray = line.split(",");
            aggregator.add(Double.parseDouble(lineArray[columnIndex]));
        }

        return aggregator.calculate();

    }
}
