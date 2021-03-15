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
           return chooseSortingType();
        }

    }

    private String chooseSortingType() {
        if ("-dataType".equals(args[0])) {
            return args[1];
        } else if (args.length == 1) {
            return "natural";
        } else {
            return args[1];
        }
    }

}
