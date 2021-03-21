package sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class WordHandler {

    private final String data;

    public WordHandler(String data) {
        this.data = data;
    }

    public ArrayList<String> readData() {
        ArrayList<String> wordsList = new ArrayList<>();
        Scanner scanner = new Scanner(data);
        while (scanner.hasNext()) {
            wordsList.add(scanner.next());
        }
        return wordsList;
    }
}
