package me.jack;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NextDay {
    public static void nextDay() {
        // 定义日期的年、月、日
        int year = 2023;
        int month = 10;
        int day = 5;

        // 调用 nextDate 方法获取明天的日期
        String nextDate = getNextDate(year, month, day);
        // 输出明天的日期
        System.out.println("明天的日期是: " + nextDate);
    }

    /**
     * 计算给定日期的下一天日期
     * @param year 年份
     * @param month 月份
     * @param day 日期
     * @return 下一天日期的字符串，格式为 "yyyy-MM-dd"
     */
    public static String getNextDate(int year, int month, int day) {
        // 创建 LocalDate 对象表示给定日期
        LocalDate date = LocalDate.of(year, month, day);
        // 计算下一天的日期
        LocalDate nextDay = date.plusDays(1);
        // 定义日期格式化器
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // 格式化下一天的日期并返回
        return nextDay.format(formatter);
    }
}
