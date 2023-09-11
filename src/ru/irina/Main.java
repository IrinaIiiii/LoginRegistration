package ru.irina;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Auth auth = new Auth();
        String command;
        String login;
        String password;
        String fullName;
        String numberTel;
        System.out.println("Программа Логин/Регистрация\nНапиши чтобы:\n1. 'логин' - авторизация\n2. 'регистрация' - регистрация\n3. 'выход' - выход из приложения");

        while (true) {
            System.out.print("Что будем делать: ");
            command = scanner.nextLine();

            if (command.equals("логин")) {
                System.out.print("Введите логин: ");
                login = scanner.nextLine();
                System.out.print("Введите пароль: ");
                password = scanner.nextLine();
                boolean loginResult = auth.login(login, password);
                if (loginResult) {
                    System.out.println("Вы вошли в личный кабинет!");

                } else {
                    System.out.println("Логин или пароль неверные");
                }
            } else if (command.equals("регистрация")) {
                System.out.print("Введите логин: ");
                login = scanner.nextLine();
                System.out.print("Введите пароль: ");
                password = scanner.nextLine();
                System.out.print("Введите полное имя: ");
                fullName = scanner.nextLine();
                System.out.print("Введите номер телефона: ");
                numberTel = scanner.nextLine();
                boolean registrationResult = auth.registration(login, password, fullName, numberTel);
                if (registrationResult) {
                    System.out.println("Регистрация прошла успешно!");
                } else {
                    System.out.println("Пользователь с таким логином уже существует");
                }
            } else if (command.equals("выход")) {
                break;
            } else {
                System.out.println("Я тебя не понял. Попробуй ещё раз!");
            }
        }
    }
}
