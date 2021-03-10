package sorting;

public class ArgumentParser {

    private final String[] args;

    public ArgumentParser(String[] args) {
        this.args = args;
    }

    public String parseArgument() {
        return args.length != 0 ? args[1] : "word";
    }

}
