package sorting;

import java.io.IOException;
import java.util.ArrayList;

public interface DataReader<T> {

    T readData() throws IOException;

}
