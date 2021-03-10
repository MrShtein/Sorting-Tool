package sorting;

import java.util.*;

public class Main {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Long> numberList = new ArrayList<>();
        long maxValue = 0L;
        long times = 0L;
        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            if (number > maxValue) {
                maxValue = number;
            }
            numberList.add(number);
        }

        for (Long num : numberList) {
            if (num == maxValue) {
                times++;
            }
        }

        System.out.printf("Total numbers: %d\n", numberList.size());
        System.out.printf("The greatest number: %d (%d time(s)).", maxValue, times);
    }
}
