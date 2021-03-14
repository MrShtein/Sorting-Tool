package sorting;

import java.util.ArrayList;

public class SortedData {

    private final long total;
    private final ArrayList<Long> sortedData;

    public SortedData(long total, ArrayList<Long> sortedData) {
        this.total = total;
        this.sortedData = sortedData;
    }

    public long getTotal() {
        return total;
    }

    public ArrayList<Long> getSortedData() {
        return sortedData;
    }
}
