package ru.netology.services;
public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }
    public long average(long[] sales) {
        if (sales.length == 0) {
            return 0;
        }
        return sum(sales) / sales.length;
    }

//    public int minSales(long[] sales) {
//        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
//
//        for (int i = 0; i < sales.length; i++) {
//            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
//                minMonth = i; // запомним его как минимальный
//            }
//        }
//
//        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
//    }

    public int monthMaxSale(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int monthMinSale(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int monthOverAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int monthBelowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

}
