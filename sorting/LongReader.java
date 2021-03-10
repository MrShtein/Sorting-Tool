package sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class LongReader implements DataReader<ArrayList<Long>> {
    @Override
    public ArrayList<Long> readData() {
        ArrayList<Long> digitsList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLong()) {
            digitsList.add(scanner.nextLong());
        }
        return digitsList;
    }
}
