package ru.netology.javaqa.HoweWork5.services;

public class aMonthsRest {
    public static int calculate(int income, int expenses, int treshold) {
        income = 10_000; // количество заработанных денег
        expenses = 3_000; // обязательные затарты в месяц
        treshold = 20_000; // количество денег необходимых для месяца отдыха
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= treshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
