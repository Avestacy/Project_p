package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    void shouldCalculateTotalSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.totalSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSalesPerMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double expected = 15;
        double actual = service.averageSalesPerMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthOfPeakSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 6;
        int actual = service.monthOfPeakSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthOfMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.monthOfMinSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthsWithBelowAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.monthsWithBelowAverageSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthsWithAboveAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 7;
        int actual = service.monthsWithAboveAverageSales(sales);

        assertEquals(expected, actual);
    }
}