package ru.netology.stats;

public class StatsService {

    public int getSalesAmount(long[] sales) {
        int salesAmount = 0;
        for (long sale : sales) {
            salesAmount = salesAmount + (int) sale;
        }
        return salesAmount;
    }

    public int getAverageSales(long[] sales) {
        int averageSales = getSalesAmount(sales) / sales.length;
        return averageSales;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int getMonthLessAverage (long[] sales) {
        int amtLess = 0;
        int average = getAverageSales(sales);
        for (long sale : sales) {
            if (sale < average) {
                amtLess = amtLess + 1;
            }
        }
        return amtLess;
    }

    public int getMonthMoreAverage (long[] sales) {
        int amtMore = 0;
        int average = getAverageSales(sales);
        for (long sale : sales) {
            if (sale > average) {
                amtMore = amtMore + 1;
            }
        }
        return amtMore;
    }


}