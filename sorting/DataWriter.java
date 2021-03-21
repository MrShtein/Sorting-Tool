package sorting;

import java.io.FileWriter;
import java.io.IOException;

public class DataWriter {

    private final String writeTo;
    private final String data;

    public DataWriter(String writeTo, String data) {
        this.writeTo = writeTo;
        this.data = data;
    }

    public void writeData() throws IOException {
        if (writeTo.isEmpty()) {
            System.out.print(data);
        } else {
            try (FileWriter fileWriter = new FileWriter(writeTo)) {
                fileWriter.write(data);
            } catch (IOException e) {
                e.getMessage();
            }
        }
    }
}
