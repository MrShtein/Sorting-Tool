package sorting;

public class Data {

    private long length;
    private String maxLengthElem;
    private long occurrenceCount;
    private long occurrenceCountInPercent;

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
