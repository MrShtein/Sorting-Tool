package sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class LongReader implements DataReader<ArrayList<Long>> {
    @Override
    public ArrayList<Long> readData() {
        ArrayList<Long> digitsList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String next = scanner.next();
            try {
                Long digit = Long.parseLong(next);
                digitsList.add(digit);
            } catch (IllegalArgumentException e) {
                System.out.printf("\"%s\" is not a long. It will be skipped.", next);
            }
        }
        return digitsList;
    }
}
