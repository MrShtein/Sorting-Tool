package sorting;

import java.lang.reflect.AnnotatedArrayType;
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
            default:
                throw new IllegalArgumentException("Something wrong with data");
        }
    }

    private void workWithLong() {
        LongReader longReader = new LongReader();
        ArrayList<Long> digits = longReader.readData();


    }

    private void workWithLines() {
        LineReader lineReader = new LineReader();
        ArrayList<String> lines = lineReader.readData();
        StringAnalyzer stringAnalyzer = new StringAnalyzer(lines);


    }

    private void workWithWords() {
        WordReader wordReader = new WordReader();
        ArrayList<String> words = wordReader.readData();
    }


}
