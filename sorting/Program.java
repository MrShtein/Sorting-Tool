package sorting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Program {

    private final String[] args;

    public Program(String[] args) {
        this.args = args;
    }

    public void run() {
        ArgumentParser argument = new ArgumentParser(args);
        try {
            DataForChooseWay args = argument.parseArgument();
            String data = new DataReaderImpl(args.getInputFile(), args.getInputFile()).readData();

            switch (args.getDataType()) {
                case "long":
                    workWithLong(args.getSortingType(), data);
                    break;
                case "line":
                    workWithLines(args.getSortingType(), data);
                    break;
                case "word":
                    workWithWords(args.getSortingType(), data);
                    break;
            }
        } catch (IllegalArgumentException | InputMismatchException | IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void workWithLong(String sortType, String data) {
        LongHandler longHandler = new LongHandler(data);
        ArrayList<Long> digits = longHandler.handleData();
        ArrayList<DigitItem> analyzedData = new DigitsAnalyzer(digits).analyzeDigits();

        if ("natural".equals(sortType)) {
            ArrayList<Long> sortedData = new DigitSorter(analyzedData).handleDataForNaturalSort();
            DataPrinter<Long> dataPrinter = new DataPrinter(sortType, sortedData, (long) digits.size());
            String dataForPrint = dataPrinter.chooseAndPrepareForDigits();
        } else {
            ArrayList<DigitItem> sortedData = new DigitSorter(analyzedData).handleDataForCountSort();
            DataPrinter<DigitItem> dataPrinter = new DataPrinter(sortType, sortedData, (long) digits.size());
            String dataForPrint = dataPrinter.chooseAndPrepareForDigits();
        }

    }

    private void workWithLines(String sortType, String data) {
        LineHandler lineHandler = new LineHandler(data);
        ArrayList<String> lines = lineHandler.handleData();
        StringAnalyzer stringAnalyzer = new StringAnalyzer(lines);
        ArrayList<StringItem> stringsList = stringAnalyzer.analyzeString();

        if ("natural".equals(sortType)) {
            ArrayList<String> sortedData = new StringSorter(stringsList).handleDataForNaturalSort();
            DataPrinter<String> dataPrinter = new DataPrinter(sortType, sortedData, (long) lines.size());
            String dataForPrint = dataPrinter.chooseAndHandleForString();
        } else {
            ArrayList<StringItem> sortedData = new StringSorter(stringsList).handleDataForCountSort();
            DataPrinter<StringItem> dataPrinter = new DataPrinter(sortType, sortedData, (long) lines.size());
            String dataForPrint = dataPrinter.chooseAndHandleForString();
        }
    }

    private void workWithWords(String sortType, String data) {
        WordHandler wordHandler = new WordHandler(data);
        ArrayList<String> lines = wordHandler.readData();
        StringAnalyzer stringAnalyzer = new StringAnalyzer(lines);
        ArrayList<StringItem> stringsList = stringAnalyzer.analyzeString();

        if ("natural".equals(sortType)) {
            ArrayList<String> sortedData = new StringSorter(stringsList).handleDataForNaturalSort();
            DataPrinter<String> dataPrinter = new DataPrinter(sortType, sortedData, (long) lines.size());
            String dataForPrint = dataPrinter.chooseAndPrintForWord();
        } else {
            ArrayList<StringItem> sortedData = new StringSorter(stringsList).handleDataForCountSort();
            DataPrinter<StringItem> dataPrinter = new DataPrinter(sortType, sortedData, (long) lines.size());
            String dataForPrint = dataPrinter.chooseAndPrintForWord();
        }
    }


}
