package sorting;

import java.util.ArrayList;

public class DigitsAnalyzer {

    private final ArrayList<Long> data;

    public DigitsAnalyzer(ArrayList<Long> data) {
        this.data = data;
    }

    public DataForAnalyze analyzeDigits() {
        DataForAnalyze analyzedDataForAnalyze = new DataForAnalyze();
        analyzedDataForAnalyze.setLength(getLength());
        analyzedDataForAnalyze.setMaxDigit(maxDigit());
        analyzedDataForAnalyze.setOccurrenceCount(occurTimesInInput(analyzedDataForAnalyze));
        analyzedDataForAnalyze.setOccurrenceCountInPercent(occurTimesInPercent(analyzedDataForAnalyze));
        return analyzedDataForAnalyze;
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

    private long occurTimesInInput(DataForAnalyze infoObj) {
        long times = 0L;
        for (Long digit : data) {
            if (digit == infoObj.getMaxDigit()) {
                times++;
            }
        }
        return times;
    }

    private long occurTimesInPercent(DataForAnalyze infoObj) {
        return infoObj.getOccurrenceCount() * 100 / data.size();
    }

}
