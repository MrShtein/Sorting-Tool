package sorting;

import java.io.IOException;

public interface DataReader<T> {

    T readData() throws IOException;

}
