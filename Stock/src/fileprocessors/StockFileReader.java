package fileprocessors;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StockFileReader {

    String filePath = null;

    public StockFileReader(String filePath) {
        this.filePath = filePath;
    }

    public List<String> getHeaders() throws IOException {
        String line = readFirstLine(filePath);
        String[] header = line.split(",");
        return new ArrayList<>(Arrays.asList(header));
    }

    static String readFirstLine(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }

    public List<String> readFileData() throws IOException {
        LinkedList<String> lines = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine(); // Salta as headers
            String line;
            line = br.readLine();
            while (line != null) {
                lines.add(line);
                line = br.readLine();
            }
        }
        return lines;
    }
}
