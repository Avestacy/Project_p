package ru.netology.stats;

public class StatsService {

    public long totalSales(long[] sales) {
        long total = 0;
        for (long sale : sales) {
            total += sale;
        }
        return total;
    }

    public double averageSalesPerMonth(long[] sales) {
        return totalSales(sales) / (double) sales.length;
    }

    public int monthOfPeakSales(long[] sales) {
        long maxSales = sales[0];
        int maxMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int monthOfMinSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int monthsWithBelowAverageSales(long[] sales) {
        double average = averageSalesPerMonth(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int monthsWithAboveAverageSales(long[] sales) {
        double average = averageSalesPerMonth(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}