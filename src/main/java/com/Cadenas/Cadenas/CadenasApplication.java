package com.Cadenas.Cadenas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CadenasApplication {

    public static void main(String[] args) {
        SpringApplication.run(CadenasApplication.class, args);

        StringManipulator str = new StringManipulator();

        //1
        String name = "   carlos    ";
        String cargo = "    analista";
        System.out.println(str.stringCorrect(name, cargo));

        String coding = "Hola Mundo";
        String letter = "n";

        //2
        System.out.println(str.getIndexOrNull(letter, coding));

        //3
        int index = str.getSubstring("hola", "la");
        System.out.println(index);


        // 4
        System.out.println(str.concatSubstring("Hola", 1, 3, "mundo"));
    }


}

