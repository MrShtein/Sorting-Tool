package sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class LineReader implements DataReader<ArrayList<String>> {

    @Override
    public ArrayList<String> readData() {
        ArrayList<String> linesList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            linesList.add(scanner.nextLine());
        }
        return linesList;
    }
}
