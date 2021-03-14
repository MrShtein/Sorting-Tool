package sorting;

public class ArgumentParser {

    private final String[] args;

    public ArgumentParser(String[] args) {
        this.args = args;
    }

    public String parseArgument() {
        if (args.length == 0) {
            return "word";
        } else {
           if (findSortArg()) {
               return "sortIntegers";
           } else {
               return args[1];
           }
        }

    }

    private boolean findSortArg() {
        for (String item : args) {
            if ("-sortIntegers".equals(item)) {
                return true;
            }
        }
        return false;
    }

}
