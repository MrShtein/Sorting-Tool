package sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class WordReader implements DataReader<ArrayList<String>>{

    @Override
    public ArrayList<String> readData() {
        ArrayList<String> wordsList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            wordsList.add(scanner.next());
        }
        return wordsList;
    }
}
