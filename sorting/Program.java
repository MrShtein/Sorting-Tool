package sorting;

import java.util.ArrayList;

public class Program {

    private final String[] args;

    public Program(String[] args) {
        this.args = args;
    }

    public void run() {
        String argument = new ArgumentParser(args).parseArgument();

        switch (argument) {
            case "long":
                workWithLong();
                break;
            case "line":
                workWithLines();
                break;
            case "word":
                workWithWords();
                break;
            case "sortIntegers":
                sortIntegers();
                break;
            default:
                throw new IllegalArgumentException("Something wrong with data");
        }
    }

    private void workWithLong() {
        LongReader longReader = new LongReader();
        ArrayList<Long> digits = longReader.readData();
        DigitsAnalyzer digitsAnalyzer = new DigitsAnalyzer(digits);
        DataPrinter dataPrinter = new DataPrinter(digitsAnalyzer.analyzeDigits());
        dataPrinter.printDigits();
    }

    private void workWithLines() {
        LineReader lineReader = new LineReader();
        ArrayList<String> lines = lineReader.readData();
        StringAnalyzer stringAnalyzer = new StringAnalyzer(lines);
        DataPrinter dataPrinter = new DataPrinter(stringAnalyzer.analyzeString());
        dataPrinter.printLines();
    }

    private void workWithWords() {
        WordReader wordReader = new WordReader();
        ArrayList<String> words = wordReader.readData();
        StringAnalyzer stringAnalyzer = new StringAnalyzer(words);
        DataPrinter dataPrinter = new DataPrinter(stringAnalyzer.analyzeString());
        dataPrinter.printWords();
    }

    private void sortIntegers() {
        LongReader longReader = new LongReader();
        ArrayList<Long> digits = longReader.readData();
        DigitSorter digitSorter = new DigitSorter(digits);
        DataPrinter dataPrinter = new DataPrinter(digitSorter.handleData());
        dataPrinter.printSortedDigits();
    }


}
