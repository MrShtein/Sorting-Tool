package sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DigitsAnalyzer {

    private final ArrayList<Long> data;

    public DigitsAnalyzer(ArrayList<Long> data) {
        this.data = data;
    }

    public ArrayList<DigitItem> analyzeDigits() {
        ArrayList<DigitItem> analyzedData = new ArrayList<>();
        HashMap<Long, Long> longHashMap = new HashMap<>();
        for (Long digit : data) {
            if (longHashMap.containsKey(digit)) {
                longHashMap.put(digit, longHashMap.get(digit) + 1);
            } else {
                longHashMap.put(digit, 1L);
            }
        }

        for (Map.Entry<Long, Long> item : longHashMap.entrySet()) {
            DigitItem digitItem = new DigitItem(item.getValue(), item.getKey(), occurTimesInPercent(item.getValue()));
            analyzedData.add(digitItem );
        }

        return analyzedData;
    }

    private double occurTimesInPercent(long countOccurrence) {
        return ((double) (countOccurrence * 100)) / data.size();
    }

}
