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
                    workWithLong(args.getSortingType(), data, args.getOutputFile());
                    break;
                case "line":
                    workWithLines(args.getSortingType(), data, args.getOutputFile());
                    break;
                case "word":
                    workWithWords(args.getSortingType(), data, args.getOutputFile());
                    break;
            }
        } catch (IllegalArgumentException | InputMismatchException | IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void workWithLong(String sortType, String data, String output) throws IOException {
        LongHandler longHandler = new LongHandler(data);
        ArrayList<Long> digits = longHandler.handleData();
        ArrayList<DigitItem> analyzedData = new DigitsAnalyzer(digits).analyzeDigits();

        if ("natural".equals(sortType)) {
            ArrayList<Long> sortedData = new DigitSorter(analyzedData).handleDataForNaturalSort();
            DataHandler<Long> dataPrinter = new DataHandler(sortType, sortedData, (long) digits.size());
            String dataForPrint = dataPrinter.chooseAndPrepareForDigits();
            DataWriter dataWriter = new DataWriter(output, dataForPrint);
            dataWriter.writeData();
        } else {
            ArrayList<DigitItem> sortedData = new DigitSorter(analyzedData).handleDataForCountSort();
            DataHandler<DigitItem> dataPrinter = new DataHandler(sortType, sortedData, (long) digits.size());
            String dataForPrint = dataPrinter.chooseAndPrepareForDigits();
            DataWriter dataWriter = new DataWriter(output, dataForPrint);
            dataWriter.writeData();
        }

    }

    private void workWithLines(String sortType, String data, String output) throws IOException {
        LineHandler lineHandler = new LineHandler(data);
        ArrayList<String> lines = lineHandler.handleData();
        StringAnalyzer stringAnalyzer = new StringAnalyzer(lines);
        ArrayList<StringItem> stringsList = stringAnalyzer.analyzeString();

        if ("natural".equals(sortType)) {
            ArrayList<String> sortedData = new StringSorter(stringsList).handleDataForNaturalSort();
            DataHandler<String> dataPrinter = new DataHandler(sortType, sortedData, (long) lines.size());
            String dataForPrint = dataPrinter.chooseAndHandleForString();
            DataWriter dataWriter = new DataWriter(output, dataForPrint);
            dataWriter.writeData();

        } else {
            ArrayList<StringItem> sortedData = new StringSorter(stringsList).handleDataForCountSort();
            DataHandler<StringItem> dataPrinter = new DataHandler(sortType, sortedData, (long) lines.size());
            String dataForPrint = dataPrinter.chooseAndHandleForString();
            DataWriter dataWriter = new DataWriter(output, dataForPrint);
            dataWriter.writeData();
        }
    }

    private void workWithWords(String sortType, String data, String output) throws IOException {
        WordHandler wordHandler = new WordHandler(data);
        ArrayList<String> lines = wordHandler.readData();
        StringAnalyzer stringAnalyzer = new StringAnalyzer(lines);
        ArrayList<StringItem> stringsList = stringAnalyzer.analyzeString();

        if ("natural".equals(sortType)) {
            ArrayList<String> sortedData = new StringSorter(stringsList).handleDataForNaturalSort();
            DataHandler<String> dataPrinter = new DataHandler(sortType, sortedData, (long) lines.size());
            String dataForPrint = dataPrinter.chooseAndPrintForWord();
            DataWriter dataWriter = new DataWriter(output, dataForPrint);
            dataWriter.writeData();
        } else {
            ArrayList<StringItem> sortedData = new StringSorter(stringsList).handleDataForCountSort();
            DataHandler<StringItem> dataPrinter = new DataHandler(sortType, sortedData, (long) lines.size());
            String dataForPrint = dataPrinter.chooseAndPrintForWord();
            DataWriter dataWriter = new DataWriter(output, dataForPrint);
            dataWriter.writeData();
        }
    }


}
