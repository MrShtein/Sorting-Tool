package sorting;

import java.util.ArrayList;
import java.util.Comparator;

public class DigitSorter {

    private ArrayList<DigitItem> data;

    public DigitSorter(ArrayList<DigitItem> data) {
        this.data = data;
    }

    public ArrayList<Long> handleDataForNaturalSort() {
        ArrayList<Long> dataList = prepareDataForPrint();
        naturalSortForList(dataList);
        return dataList;
    }

    public ArrayList<DigitItem> handleDataForCountSort() {
        naturalSortForDigitItem(data);
        countSort();
        return data;
    }

    private void naturalSortForDigitItem(ArrayList<DigitItem> dataForSort) {
        dataForSort.sort(new Comparator<DigitItem>() {
            @Override
            public int compare(DigitItem aLong, DigitItem t1) {
                return (int) (aLong.getValue() - t1.getValue());
            }
        });
    }

    private void naturalSortForList(ArrayList<Long> dataForSort) {
        dataForSort.sort(new Comparator<Long>() {
            @Override
            public int compare(Long aLong, Long t1) {
                return (int) (aLong - t1);
            }
        });
    }

    private void countSort() {
        data.sort(new Comparator<DigitItem>() {
            @Override
            public int compare(DigitItem aLong, DigitItem t1) {
                return (int) (aLong.getOccurrence() - t1.getOccurrence());
            }
        });
    }

    private ArrayList<Long> prepareDataForPrint() {
        ArrayList<Long> dataForPrint = new ArrayList<>();
        for (DigitItem item : data) {
            if (item.getOccurrence() > 1) {
                for (int i = 0; i < item.getOccurrence(); i++) {
                    dataForPrint.add(item.getValue());
                }
            } else {
                dataForPrint.add(item.getValue());
            }
        }
        return dataForPrint;
    }

}
