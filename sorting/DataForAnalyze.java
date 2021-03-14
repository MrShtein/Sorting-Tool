package sorting;

public class DataForAnalyze {

    private long length;
    private String maxLengthElem;
    private long maxDigit;
    private long occurrenceCount;
    private long occurrenceCountInPercent;

    public long getMaxDigit() {
        return maxDigit;
    }

    public void setMaxDigit(long maxDigit) {
        this.maxDigit = maxDigit;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setMaxLengthElem(String maxLengthElem) {
        this.maxLengthElem = maxLengthElem;
    }

    public void setOccurrenceCount(long occurrenceCount) {
        this.occurrenceCount = occurrenceCount;
    }

    public void setOccurrenceCountInPercent(long occurrenceCountInPercent) {
        this.occurrenceCountInPercent = occurrenceCountInPercent;
    }

    public String getMaxLengthElem() {
        return maxLengthElem;
    }

    public long getOccurrenceCount() {
        return occurrenceCount;
    }

    public long getOccurrenceCountInPercent() {
        return  occurrenceCountInPercent;
    }

    public long getLength() {
        return length;
    }
}
