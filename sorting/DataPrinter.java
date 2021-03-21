package sorting;

import java.util.ArrayList;

public class DataPrinter<T> {

    private final ArrayList<T> sortedData;
    private final String sortType;
    private final long length;
    protected StringBuilder sb;

    public DataPrinter(String sortType, ArrayList<T> data, Long length) {
        this.sortType = sortType;
        this.sortedData = data;
        this.length = length;
        sb = new StringBuilder();
    }

    public String chooseAndHandleForString() {
        if ("natural".equals(sortType)) {
            return prepareStringNaturalSort();
        } else {
            return prepareStringCountSort();
        }
    }

    public String chooseAndPrintForWord() {
        if ("natural".equals(sortType)) {
            return prepareWordNaturalSort();
        } else {
            return prepareStringCountSort();
        }
    }

    private String prepareWordNaturalSort() {
        preparePreparatoryData();
        prepareArrayList();
        return sb.toString();
    }

    public String chooseAndPrepareForDigits() {
        if ("natural".equals(sortType)) {
            return prepareDigitsNaturalSort();
        } else {
            return prepareDigitsCountSort();
        }
    }

    private String prepareDigitsNaturalSort() {
        preparePreparatoryData();
        prepareArrayList();
        return sb.toString();
    }

    private void prepareArrayList() {
        for (Object digit : sortedData) {
            sb.append(digit)
                    .append(" ");
        }
    }

    private void printLinesArrayList() {
        for (Object digit : sortedData) {
            sb.append(digit)
                    .append("\n");
        }
    }

    private String prepareDigitsCountSort() {
        sb.append(String.format("Total numbers: %d.\n", length));
        for (Object item : sortedData) {
            DigitItem digitItem = (DigitItem) item;
            sb.append(String.format("%d: %d time(s), %d%%\n",
                    digitItem.getValue(), digitItem.getOccurrence(), Math.round(digitItem.getOccurrenceInPercent())));
        }
        return sb.toString();
    }

    private String prepareStringNaturalSort() {
        preparePreparatoryData();
        sb.append("\n");
        printLinesArrayList();
        return sb.toString();
    }

    private void preparePreparatoryData() {
        sb.append(String.format("Total numbers: %d.\n", length))
                .append("Sorted data: ");
    }

    private String prepareStringCountSort() {
        sb.append(String.format("Total numbers: %d.\n", length));
        for (Object item : sortedData) {
            StringItem strItem = (StringItem) item;
            sb.append(String.format("%s: %d time(s), %d%%\n",
                    strItem.getValue(), strItem.getOccurrence(), Math.round(strItem.getOccurrenceInPercent())));
        }
        return sb.toString();
    }


}
