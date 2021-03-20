package sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StringAnalyzer {

    private final ArrayList<String> data;

    public StringAnalyzer(ArrayList<String> data) {
        this.data = data;
    }


    public ArrayList<StringItem> analyzeString() {
        ArrayList<StringItem> analyzedData = new ArrayList<>();
        HashMap<String, Long> longHashMap = new HashMap<>();
        for (String str : data) {
            if (longHashMap.containsKey(str)) {
                longHashMap.put(str, longHashMap.get(str) + 1);
            } else {
                longHashMap.put(str, 1L);
            }
        }

        for (Map.Entry<String, Long> item : longHashMap.entrySet()) {
            StringItem strItem = new StringItem(item.getValue(), item.getKey(), occurTimesInPercent(item.getValue()));
            analyzedData.add(strItem);
        }

        return analyzedData;
    }

    private double occurTimesInPercent(long countOccurrence) {
        return ((double) (countOccurrence * 100)) / data.size();
    }


}
