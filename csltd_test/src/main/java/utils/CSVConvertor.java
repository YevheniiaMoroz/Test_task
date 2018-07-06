package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVConvertor {
    /**
     * CSVConvertor.class convert list of search results to csv-file
     * @param pathToSave
     * @param names
     * @return
     */
    public static synchronized File createCsvWithLines(String pathToSave, List<String> names) {
        PrintWriter pw = null;
        File file = new File(pathToSave);
        try {
            pw = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            new FileNotFoundException("Fail");
        }
        StringBuilder sb = new StringBuilder();
        for (String name : names) {
            sb.append(name);
            sb.append('\n');
        }
        pw.write(sb.toString());
        pw.close();
        return file;
    }

    public static List<String> convertCsvToList(File file) {
        List<String> list = null;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            list = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            new FileNotFoundException("Fail");
        }
        return list;
    }
}
