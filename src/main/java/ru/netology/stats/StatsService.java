package ru.netology.stats;

public class StatsService {
    public int calcSum(int[] account) {// сумма за год

        int sum = 0;
        for (int i = 0; i < account.length; i++) {
            sum = sum + account[i];
        }

        return sum;

    }

    public double calcAverage(int[] account) {// средняя сумма за мес
        int sumArray = 0;
        for (int i = 0; i < account.length; i++) {
            sumArray = sumArray + account[i];
        }

        return (double) sumArray / account.length;
    }

    public int calcEndMaxMonth(int[] account) {// макс.месяц
        int endMaxMonth = 0;


        for (int i = 0; i < account.length; i++) {
            if (account[i] >= account[endMaxMonth]) {
                endMaxMonth = i;
            }
        }
        endMaxMonth += 1;

        return endMaxMonth;


    }

    public int calcEndMinMonth(int[] account) {//мин месяц
        int endMinMonth = 0;


        for (int i = 0; i < account.length; i++) {
            if (account[i] <= account[endMinMonth]) {
                endMinMonth = i;
            }
        }

        endMinMonth += 1;

        return endMinMonth;

    }


    public int calcLowerAverage(int[] account) {//кол-во меньше среднего
        int count = 0;
        double averageSum = calcAverage(account);

        for (int sales : account) {
            if (sales < averageSum) {
                count = count + 1;
            }
        }

        return count;


    }

    public int calcUpperAverage(int[] account) {//кол-во больше среднего
        int count = 0;
        double averageSum = calcAverage(account);

        for (int sales : account) {
            if (sales > averageSum) {
                count = count + 1;
            }
        }

        return count;

    }
}

