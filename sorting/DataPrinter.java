package sorting;

public class DataPrinter {

    private final DataForAnalyze dataForAnalyze;
    private final SortedData sortedData;

    public DataPrinter(DataForAnalyze dataForAnalyze) {
        this.dataForAnalyze = dataForAnalyze;
        this.sortedData = null;
    }

    public DataPrinter(SortedData sortedData) {
        this.sortedData = sortedData;
        this.dataForAnalyze = null;
    }

    public void printLines() {
        System.out.printf("Total lines: %d.\n", dataForAnalyze.getLength());
        System.out.printf("The longest line:\n%s\n", dataForAnalyze.getMaxLengthElem());
        System.out.printf("(%d time(s), %d%%).", dataForAnalyze.getOccurrenceCount(), dataForAnalyze.getOccurrenceCountInPercent());
    }

    public void printWords() {
        System.out.printf("Total words: %d.\n", dataForAnalyze.getLength());
        System.out.printf("The longest word: %s (%d time(s), %d%%)",
                dataForAnalyze.getMaxLengthElem(), dataForAnalyze.getOccurrenceCount(), dataForAnalyze.getOccurrenceCountInPercent());
    }

    public void printDigits() {
        System.out.printf("Total numbers: %d.\n", dataForAnalyze.getLength());
        System.out.printf("The greatest number: %d (%d time(s), %d%%)",
                dataForAnalyze.getMaxDigit(), dataForAnalyze.getOccurrenceCount(), dataForAnalyze.getOccurrenceCountInPercent());
    }

    public void printSortedDigits() {
        System.out.printf("Total numbers: %d.\n", sortedData.getTotal());
        System.out.print("Sorted data: ");
        printArray();
    }

    private void printArray() {
        for (Long digit : sortedData.getSortedData()) {
            System.out.print(digit + " ");
        }
    }
}
