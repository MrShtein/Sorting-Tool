package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class ArgumentParser {

    private final String[] args;

    public ArgumentParser(String[] args) {
        this.args = args;
    }

    public DataForChooseWay parseArgument() {
        DataForChooseWay data = new DataForChooseWay();
        data.setSortingType(getSortType());
        data.setDataType(getType());

        String inputFile = getFileAddr("inputFile");
        String outputFile = getFileAddr("outputFile");

        if (!inputFile.isEmpty()) {
            data.setInputFile(inputFile);
        }
        if (!outputFile.isEmpty()) {
            data.setOutputFile(outputFile);
        }

        getExtraArgsAndPrintIt();
        return data;
    }

    private String getType() throws IllegalArgumentException {
        int position = Arrays.asList(args).indexOf("-dataType");
        if (position == -1) {
            return "word";
        } else {
            if (position + 1 < args.length && !args[position + 1].startsWith("-")) {
                return args[position + 1];
            } else {
                throw new IllegalArgumentException("No data type defined!");
            }
        }
    }

    private String getSortType() throws IllegalArgumentException {
        int position = Arrays.asList(args).indexOf("-sortingType");
        if (position == -1) {
            return "natural";
        } else {
            if (position + 1 < args.length && !args[position + 1].startsWith("-")) {
                return args[position + 1];
            } else {
                throw new IllegalArgumentException("No sorting type defined!");
            }
        }
    }

    private void getExtraArgsAndPrintIt() {
        for (String arg : args) {
            if (arg.startsWith("-") && !arg.equals("-sortingType") && !arg.equals("-dataType")
            && !arg.equals("-inputFile") && !arg.equals("-outputFile")) {
                System.out.printf("\"%s\" is not a valid parameter. It will be skipped.\n", arg);
            }
        }
    }

    private String getFileAddr(String inputOrOutput) {
        int position = Arrays.asList(args).indexOf("-" + inputOrOutput);
        if (position == -1) {
            return "";
        } else {
            if (position + 1 < args.length && !args[position + 1].startsWith("-")) {
                return args[position + 1];
            } else {
                throw new IllegalArgumentException(String.format("No %s file name defined", inputOrOutput));
            }
        }
    }


}
