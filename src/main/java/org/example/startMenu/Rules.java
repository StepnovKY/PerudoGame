package org.example.startMenu;

import java.io.*;

public class Rules {
    public Rules() throws IOException {
        File file = new File("C:\\Users\\SaWLxx\\Desktop\\rules.txt");
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String rules;
        while ((rules = bufferedReader.readLine()) != null) {
            System.out.println(rules);
        }
    }
}