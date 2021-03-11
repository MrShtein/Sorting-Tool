package sorting;

import java.util.ArrayList;

public class DigitsAnalyzer {

    private final ArrayList<Long> data;

    public DigitsAnalyzer(ArrayList<Long> data) {
        this.data = data;
    }

    public Data analyzeDigits() {
        Data analyzedData = new Data();
        analyzedData.setLength(getLength());
        analyzedData.setMaxDigit(maxDigit());
        analyzedData.setOccurrenceCount(occurTimesInInput(analyzedData));
        analyzedData.setOccurrenceCountInPercent(occurTimesInPercent(analyzedData));
        return analyzedData;
    }

    private long getLength() {
        return data.size();
    }

    private long maxDigit() {
        long maxDigit = 0L;
        for (Long digit : data) {
            if (maxDigit < digit) {
                maxDigit = digit;
            }
        }
        return maxDigit;
    }

    private long occurTimesInInput(Data infoObj) {
        long times = 0L;
        for (Long digit : data) {
            if (digit == infoObj.getMaxDigit()) {
                times++;
            }
        }
        return times;
    }

    private long occurTimesInPercent(Data infoObj) {
        return infoObj.getOccurrenceCount() * 100 / data.size();
    }

}
