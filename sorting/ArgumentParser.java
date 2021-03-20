package sorting;

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

        return data;
    }

    private String getType() {
        String temp = "-dataType";
        int position = Arrays.asList(args).indexOf("-dataType");
        if (position == -1) {
            return "word";
        } else {
            if (position + 1 < args.length && !args[position + 1].startsWith("-")) {
                return args[position + 1];
            } else {
                return "word";
            }
        }
    }

    private String getSortType() {
        int position = Arrays.asList(args).indexOf("-sortingType");
        if (position == -1) {
            return "natural";
        } else {
            if (position + 1 < args.length && !args[position + 1].startsWith("-")) {
                return args[position + 1];
            } else {
                return "natural";
            }
        }
    }
}
