package sorting;

import java.util.ArrayList;

public class StringAnalyzer {

    private final ArrayList<String> data;

    public StringAnalyzer(ArrayList<String> data) {
        this.data = data;
    }

    public Data analyzeLines() {
        Data analyzedData = new Data();
        analyzedData.setLength(getLength());
        analyzedData.setMaxLengthElem(maxLengthItem());
        analyzedData.setOccurrenceCount(occurTimesInInput(analyzedData));
        analyzedData.setOccurrenceCountInPercent(occurTimesInPercent(analyzedData));
        return analyzedData;
    }

    private long getLength() {
        return data.size();
    }

    private String maxLengthItem() {
        String maxLength = "";
        for (String item : data) {
            if (maxLength.length() < item.length()) {
                maxLength = item;
            }
        }
        return maxLength;
    }

    private long occurTimesInInput(Data infoObj) {
        long times = 0L;
        for (String item : data) {
            if (item.equals(infoObj.getMaxLengthElem())) {
                times++;
            }
        }
        return times;
    }

    private long occurTimesInPercent(Data infoObj) {
        return infoObj.getOccurrenceCount() * 100 / data.size();
    }


}
