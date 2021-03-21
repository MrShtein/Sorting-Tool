package sorting;

import java.io.IOException;

public class DataReaderImpl implements DataReader<String>{

    private final String readerName;
    private final String readFrom;

    public DataReaderImpl(String readerName, String readFrom) {
        this.readerName = readerName;
        this.readFrom = readFrom;
    }

    public String readData() throws IOException {
        if (!readerName.isEmpty()) {
            return new FileReader(readFrom).readData();
        } else {
            return new ConsoleReader(readFrom).readData();
        }
    }
}
