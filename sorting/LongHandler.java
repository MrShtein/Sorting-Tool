package sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class LongHandler {

    private final String data;

    public LongHandler(String data) {
        this.data = data;
    }

    public ArrayList<Long> handleData() {
        ArrayList<Long> digitsList = new ArrayList<>();
        Scanner scanner = new Scanner(data);

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
