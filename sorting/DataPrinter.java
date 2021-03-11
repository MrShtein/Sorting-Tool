package sorting;

public class DataPrinter {

    private final Data data;

    public DataPrinter(Data data) {
        this.data = data;
    }

    public void printLines() {
        System.out.printf("Total lines: %d.\n", data.getLength());
        System.out.printf("The longest line:\n%s\n", data.getMaxLengthElem());
        System.out.printf("(%d time(s), %d%%).", data.getOccurrenceCount(), data.getOccurrenceCountInPercent());
    }

    public void printWords() {
        System.out.printf("Total words: %d.\n", data.getLength());
        System.out.printf("The longest word: %s (%d time(s), %d%%)",
                data.getMaxLengthElem(), data.getOccurrenceCount(), data.getOccurrenceCountInPercent());
    }

    public void printDigits() {
        System.out.printf("Total numbers: %d.\n", data.getLength());
        System.out.printf("The greatest number: %d (%d time(s), %d%%)",
                data.getMaxDigit(), data.getOccurrenceCount(), data.getOccurrenceCountInPercent());
    }
}
