package sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class LineHandler {

    private final String data;

    public LineHandler(String data) {
        this.data = data;
    }

    public ArrayList<String> handleData() {
        ArrayList<String> linesList = new ArrayList<>();
        Scanner scanner = new Scanner(data);
        while (scanner.hasNextLine()) {
            linesList.add(scanner.nextLine());
        }
        return linesList;
    }
}
