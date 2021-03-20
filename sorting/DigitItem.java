package sorting;

public class DigitItem {

    private final long occurrence;
    private final long value;
    private final double occurrenceInPercent;

    public DigitItem(long occurrence, long value, double occurrenceInPercent) {
        this.occurrence = occurrence;
        this.value = value;
        this.occurrenceInPercent = occurrenceInPercent;
    }

    public long getOccurrence() {
        return occurrence;
    }

    public long getValue() {
        return value;
    }

    public double getOccurrenceInPercent() {
        return occurrenceInPercent;
    }
}
