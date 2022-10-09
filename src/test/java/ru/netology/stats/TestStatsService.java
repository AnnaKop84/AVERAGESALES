package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStatsService {
    @Test
    void shouldCalcSum() {
        StatsService service = new StatsService();
        int[] account = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expect = 180;
        int actual = service.calcSum(account);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void shouldCalcAverage() {
        StatsService service = new StatsService();
        int[] account = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expect = 15;
        double actual = service.calcAverage(account);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void shouldCalcEndMaxMonth() {
        StatsService service = new StatsService();
        int[] account = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expect = 8;
        int actual = service.calcEndMaxMonth(account);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void shouldCalcEndMinMonth() {
        StatsService service = new StatsService();
        int[] account = {8, 15, 13, 15, 17, 20, 19, 20, 7, 10, 14, 18};
        int expect = 9;
        int actual = service.calcEndMinMonth(account);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void shouldCalcLowerAverage() {
        StatsService service = new StatsService();
        int[] account = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expect = 5;
        double actual = service.calcLowerAverage(account);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void shouldCalcUpperAverage() {
        StatsService service = new StatsService();
        int[] account = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expect = 5;
        double actual = service.calcUpperAverage(account);
        Assertions.assertEquals(expect, actual);
    }

}
