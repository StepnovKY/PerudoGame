package org.example.startMenu;

import java.util.Scanner;
import java.util.Arrays;

import static org.example.data.BotNames.bots;

public class ChooseName {
    public ChooseName(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("""
                    [1] Ввести имя
                    [2] Сгенерировать случайно
                    """);
            switch (scanner.nextLine()){
                case "1":
                    //Ввод имени
                    System.out.println("Введите имя");
                    String name = scanner.nextLine();
                    System.out.println("Выбраное имя: " + name);
                    break;

                case "2":
                    //Случайная генерация
                    String randomName = Arrays.stream(bots).parallel().findAny().get();
                    System.out.println("Выбранное имя: " + randomName);
                    break;
                default:
                    //Ошибка ввода
                    System.out.println("Ошибка. Выберите из предложенного списка.");
            }
        }
    }
}
