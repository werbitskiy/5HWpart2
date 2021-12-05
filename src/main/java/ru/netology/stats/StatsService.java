package ru.netology.stats;

public class StatsService {
    public long sum(long[] items) {
        long result = 0;
        for (long item : items) {
            result += item;

        }
        return result;
    }

    public long average(long[] items) {
        return sum(items) / items.length;

    }

    public int monthWithMax(long[] items) {
        long max = items[0];
        for (long item : items) {
            if (max < item) {
                max = item;
            }
        }
        int monthCount = 0;
        int monthWithMax = 0;
        for (long item : items) {
            monthCount++;
            if (item == max) {
                monthWithMax = monthCount;
            }

        }
        return monthWithMax;

    }

    public int monthWithMin(long[] items) {
        long min = items[0];
        for (long item : items) {
            if (min > item) {
                min = item;
            }
        }
        int monthCount = 0;
        int monthWithMin = 0;
        for (long item : items) {
            monthCount++;
            if (item == min) {
                monthWithMin = monthCount;
            }

        }
        return monthWithMin;

    }

    public int monthsWithMoreThanAverage(long[] items) {
        long average = average(items);
        int monthCount = 0;
        for (long item : items) {
            monthCount++;
            if (item > average) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public int monthsWithLessThanAverage(long[] items) {
        long average = average(items);
        int monthCount = 0;
        for (long item : items) {
            monthCount++;
            if (item < average) {
                monthCount++;
            }
        }
        return monthCount;
    }
}

