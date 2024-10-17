package org.example.startMenu;

import java.io.*;

public class Rules {
    public Rules() {
        File file = new File("C:\\Users\\SaWLxx\\Desktop\\rules.txt");
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String rules;
        while (true) {
            try {
                if ((rules = bufferedReader.readLine()) == null)
                    break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(rules);
        }
    }
}