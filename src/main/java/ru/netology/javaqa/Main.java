package ru.netology.javaqa;

public class Main {
    public static void main(String[] args) {
        CountService service = new CountService();
        System.out.println(service.calculate(100_000, 60_000, 150_000));
    }
}
