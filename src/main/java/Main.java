import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println("Сумма продаж за год " + service.getSalesAmount(sales));
        System.out.println("Средняя сумма продаж в месяц " + service.getAverageSales(sales));
        System.out.println("Пик продаж в месяце номер  " + service.maxSales(sales));
        System.out.println("Минимум продаж в месяце номер  " + service.minSales(sales));
        System.out.println("Количество месяцев, в которых продажи были ниже среднего:  " + service.getMonthLessAverage(sales));
        System.out.println("Количество месяцев, в которых продажи были выше среднего:  " + service.getMonthMoreAverage(sales));
    }
}