package sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Program {

    private final String[] args;

    public Program(String[] args) {
        this.args = args;
    }

    public void run() {
        DataForChooseWay argument = new ArgumentParser(args).parseArgument();

        switch (argument.getDataType()) {
            case "long":
                workWithLong(argument.getSortingType());
                break;
            case "line":
                workWithLines(argument.getSortingType());
                break;
            case "word":
                workWithWords(argument.getSortingType());
                break;
            default:
                throw new IllegalArgumentException("Something wrong with data");
        }
    }

    private void workWithLong(String sortType) {
        LongReader longReader = new LongReader();
        ArrayList<Long> digits = longReader.readData();
        ArrayList<DigitItem> analyzedData = new DigitsAnalyzer(digits).analyzeDigits();

        if ("natural".equals(sortType)) {
            ArrayList<Long> sortedData = new DigitSorter(analyzedData).handleDataForNaturalSort();
            DataPrinter<Long> dataPrinter = new DataPrinter(sortType, sortedData, (long) digits.size());
            dataPrinter.chooseAndPrintForDigits();
        } else {
            ArrayList<DigitItem> sortedData = new DigitSorter(analyzedData).handleDataForCountSort();
            DataPrinter<DigitItem> dataPrinter = new DataPrinter(sortType, sortedData, (long) digits.size());
            dataPrinter.chooseAndPrintForDigits();
        }

    }

    private void workWithLines(String sortType) {
        LineReader lineReader = new LineReader();
        ArrayList<String> lines = lineReader.readData();
        StringAnalyzer stringAnalyzer = new StringAnalyzer(lines);
        ArrayList<StringItem> stringsList = stringAnalyzer.analyzeString();

        if ("natural".equals(sortType)) {
            ArrayList<String> sortedData = new StringSorter(stringsList).handleDataForNaturalSort();
            DataPrinter<String> dataPrinter = new DataPrinter(sortType, sortedData, (long) lines.size());
            dataPrinter.chooseAndPrintForString();
        } else {
            ArrayList<StringItem> sortedData = new StringSorter(stringsList).handleDataForCountSort();
            DataPrinter<StringItem> dataPrinter = new DataPrinter(sortType, sortedData, (long) lines.size());
            dataPrinter.chooseAndPrintForString();
        }
    }

    private void workWithWords(String sortType) {
        WordReader wordReader = new WordReader();
        ArrayList<String> lines = wordReader.readData();
        StringAnalyzer stringAnalyzer = new StringAnalyzer(lines);
        ArrayList<StringItem> stringsList = stringAnalyzer.analyzeString();

        if ("natural".equals(sortType)) {
            ArrayList<String> sortedData = new StringSorter(stringsList).handleDataForNaturalSort();
            DataPrinter<String> dataPrinter = new DataPrinter(sortType, sortedData, (long) lines.size());
            dataPrinter.chooseAndPrintForWord();
        } else {
            ArrayList<StringItem> sortedData = new StringSorter(stringsList).handleDataForCountSort();
            DataPrinter<StringItem> dataPrinter = new DataPrinter(sortType, sortedData, (long) lines.size());
            dataPrinter.chooseAndPrintForWord();
        }
    }


}
