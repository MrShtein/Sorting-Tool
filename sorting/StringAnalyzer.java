package sorting;

import java.util.ArrayList;

public class StringAnalyzer {

    private final ArrayList<String> data;

    public StringAnalyzer(ArrayList<String> data) {
        this.data = data;
    }


    public DataForAnalyze analyzeString() {
        DataForAnalyze analyzedDataForAnalyze = new DataForAnalyze();
        analyzedDataForAnalyze.setLength(getLength());
        analyzedDataForAnalyze.setMaxLengthElem(maxLengthItem());
        analyzedDataForAnalyze.setOccurrenceCount(occurTimesInInput(analyzedDataForAnalyze));
        analyzedDataForAnalyze.setOccurrenceCountInPercent(occurTimesInPercent(analyzedDataForAnalyze));
        return analyzedDataForAnalyze;
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

    private long occurTimesInInput(DataForAnalyze infoObj) {
        long times = 0L;
        for (String item : data) {
            if (item.equals(infoObj.getMaxLengthElem())) {
                times++;
            }
        }
        return times;
    }

    private long occurTimesInPercent(DataForAnalyze infoObj) {
        return infoObj.getOccurrenceCount() * 100 / data.size();
    }


}
