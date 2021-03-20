package sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DataPrinter<T> {

    private final ArrayList<T> sortedData;
    private final String sortType;
    private final long length;

    public DataPrinter(String sortType, ArrayList<T> data, Long length) {
        this.sortType = sortType;
        this.sortedData = data;
        this.length = length;
    }

    public void chooseAndPrintForString() {
        if ("natural".equals(sortType)) {
            printStringNaturalSort();
        } else {
            printStringCountSort();
        }
    }

    public void chooseAndPrintForWord() {
        if ("natural".equals(sortType)) {
            printWordNaturalSort();
        } else {
            printStringCountSort();
        }
    }

    private void printWordNaturalSort() {
        printPreparatoryData();
        printArrayList();
    }

    public void chooseAndPrintForDigits() {
        if ("natural".equals(sortType)) {
            printDigitsNaturalSort();
        } else {
            printDigitsCountSort();
        }
    }

    private void printDigitsNaturalSort() {
       printPreparatoryData();
       printArrayList();
    }

    private void printArrayList() {
        for (Object digit : sortedData) {
            System.out.print(digit + " ");
        }
    }

    private void printLinesArrayList() {
        for (Object digit : sortedData) {
            System.out.println(digit);
        }
    }

    private void printDigitsCountSort() {
        System.out.printf("Total numbers: %d.\n", length);
        for (Object item : sortedData) {
            DigitItem digitItem = (DigitItem) item;
            System.out.printf("%d: %d time(s), %d%%\n",
                    digitItem.getValue(), digitItem.getOccurrence(), Math.round(digitItem.getOccurrenceInPercent()));
        }
    }

    private void printStringNaturalSort() {
        printPreparatoryData();
        System.out.println();
        printLinesArrayList();
    }

    private void printPreparatoryData() {
        System.out.printf("Total numbers: %d.\n", length);
        System.out.print("Sorted data: ");
    }

    private void printStringCountSort() {
        System.out.printf("Total numbers: %d.\n", length);
        for (Object item : sortedData) {
            StringItem strItem = (StringItem) item;
            System.out.printf("%s: %d time(s), %d%%\n",
                    strItem.getValue(), strItem.getOccurrence(), Math.round(strItem.getOccurrenceInPercent()));
        }
    }


}
