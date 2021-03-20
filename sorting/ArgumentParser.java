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
            if (arg.startsWith("-") && !arg.equals("-sortingType") && !arg.equals("-dataType")) {
                System.out.printf("\"%s\" is not a valid parameter. It will be skipped.\n", arg);
            }
        }
    }
}
