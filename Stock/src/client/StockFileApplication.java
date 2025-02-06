package client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import fileprocessors.StockFileData;
import fileprocessors.StockFileReader;

public class StockFileApplication {

    public static void main(String args[]) throws IOException{


        StockFileReader fr = new StockFileReader("src/table.csv");
        List<HashMap<String, Double>> dataResult = populateStockFileData(fr.getHeaders(), fr.readFileData());
        StockFileData fileData = new StockFileData();
        fileData.addData(dataResult);
        fileData.printData();
        System.out.println(dataResult.size());



         }

        public static List<HashMap<String, Double>> populateStockFileData(List<String> headers, List<String> lines){
            List<HashMap<String, Double>> dataResult = new ArrayList<>();
            String[] dataSplitted;

            for(String line : lines){
                LinkedHashMap<String,Double> data = new LinkedHashMap<>();
                dataSplitted = line.split(",");
                for(int i = 0; i < headers.size(); i++){
                    data.put(headers.get(i), Double.parseDouble(dataSplitted[i]));
                }
                dataResult.add(data);
            }
            return dataResult;
        }


    }

