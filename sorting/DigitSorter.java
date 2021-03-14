package sorting;

import java.util.ArrayList;
import java.util.Comparator;

public class DigitSorter {

    private final ArrayList<Long> data;

    public DigitSorter(ArrayList<Long> data) {
        this.data = data;
    }

    public SortedData handleData() {
        simpleAscendingSort();
        return new SortedData(data.size(), data);
    }

    private void simpleAscendingSort() {
        data.sort(new Comparator<Long>() {
            @Override
            public int compare(Long aLong, Long t1) {
                return (int) (aLong - t1);
            }
        });
    }
}
