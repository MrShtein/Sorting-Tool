package sorting;

import java.util.ArrayList;
import java.util.Comparator;

public class StringSorter {

    private ArrayList<StringItem> data;

    public StringSorter(ArrayList<StringItem> data) {
        this.data = data;
    }

    public ArrayList<String> handleDataForNaturalSort() {
        ArrayList<String> dataList = prepareDataForPrint();
        naturalSortForList(dataList);
        return dataList;
    }

    public ArrayList<StringItem> handleDataForCountSort() {
        naturalSortForDigitItem(data);
        countSort();
        return data;
    }

    private void naturalSortForDigitItem(ArrayList<StringItem> dataForSort) {
        dataForSort.sort(new Comparator<StringItem>() {
            @Override
            public int compare(StringItem aLong, StringItem t1) {
                return aLong.getValue().compareTo(t1.getValue());
            }
        });
    }

    private void naturalSortForList(ArrayList<String> dataForSort) {
        dataForSort.sort(new Comparator<String>() {
            @Override
            public int compare(String aLong, String t1) {
                return aLong.compareTo(t1);
            }
        });
    }

    private void countSort() {
        data.sort(new Comparator<StringItem>() {
            @Override
            public int compare(StringItem aLong, StringItem t1) {
                return (int) (aLong.getOccurrence() - t1.getOccurrence());
            }
        });
    }

    private ArrayList<String> prepareDataForPrint() {
        ArrayList<String> dataForPrint = new ArrayList<>();
        for (StringItem item : data) {
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
