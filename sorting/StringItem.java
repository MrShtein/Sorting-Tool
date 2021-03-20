package sorting;

public class StringItem {

    private final long occurrence;
    private final String value;
    private final double occurrenceInPercent;

    public StringItem(long occurrence, String value, double occurrenceInPercent) {
        this.occurrence = occurrence;
        this.value = value;
        this.occurrenceInPercent = occurrenceInPercent;
    }

    public long getOccurrence() {
        return occurrence;
    }

    public String getValue() {
        return value;
    }

    public double getOccurrenceInPercent() {
        return occurrenceInPercent;
    }
}
