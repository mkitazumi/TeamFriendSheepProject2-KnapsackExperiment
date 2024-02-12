package General;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {
    private List<Integer> resultList;

    public int[] load(File input) {
        resultList = new ArrayList<>();

        try (Scanner scanner = new Scanner(input)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                processCSVLine(line);
            }

            System.out.println("File " + input.getName() + " successfully loaded!");
        } catch (FileNotFoundException e) {
            System.out.println("File " + input.getName() + " could not be found!");
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }

    private void processCSVLine(String line) {
        String[] values = line.split(",");

        for (String value : values) {
            try {
                // Remove spaces and symbols, then add the integer to the result list
                int intValue = Integer.parseInt(value.replaceAll("[^\\d-]", ""));
                resultList.add(intValue);
            } catch (NumberFormatException e) {
                // Handle the case where a value is not a valid integer
                e.printStackTrace();
            }
        }
    }
}
