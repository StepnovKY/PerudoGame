package org.example.startMenu;

import java.util.Scanner;

public class StartMenu {
    public StartMenu() {
        boolean stopProcess = false;
        Scanner scanner = new Scanner(System.in);

        while (!stopProcess) {
            System.out.println("""
                    
                    Perudo Game
                    Выберите действие:
                    [1] Начать игру
                    [2] Правила игры
                    [3] Выйти
                    """);
            switch (scanner.nextLine()) {
                case "1":
                    //Начало игры (StartGame.java)
                    break;
                case "2":
                    //Правила игры из файла rule.txt (Rules.java)
                    Rules rules = new Rules();
                    break;
                case "3":
                    //Выход из игры
                    System.out.println("Программа завершена");
                    stopProcess = true;
                    break;
                default:
                    //Ошибка ввода
                    System.out.println("Ошибка. Выберите из предложенного списка.");
            }
        }
    }
}