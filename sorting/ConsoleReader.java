package sorting;


import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ConsoleReader implements DataReader<String> {

    private final String readFrom;

    public ConsoleReader(String readFrom) {
        this.readFrom = readFrom;
    }

    @Override
    public String readData() throws IOException {
        try(BufferedInputStream bf = new BufferedInputStream(System.in)) {
            return new String(bf.readAllBytes());
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
        throw new FileNotFoundException("File not found");
    }
}
