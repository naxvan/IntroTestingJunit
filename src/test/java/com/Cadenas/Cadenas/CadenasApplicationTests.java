package com.Cadenas.Cadenas;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class CadenasApplicationTests {

    @Test
    public void contextLoads() {
        StringManipulator stringManipulator = new StringManipulator();
        String res = stringManipulator.stringCorrect(" hola ", " Mundo       ");
        assertEquals("hola Mundo", res);


    }

    @Test
    public void testIndexOf() {
        StringManipulator stringManipulator = new StringManipulator();
        int res = stringManipulator.getIndexOrNull("3", "Hola");
        assertEquals(-1, res);
    }



    @Test
    void testGetSubstring(){
        StringManipulator stringManipulator = new StringManipulator();
        int res = stringManipulator.getSubstring("hola","la");
        assertEquals(2,res);
    }






    @Test
    void testConcatSubstring() {
        StringManipulator stringManipulator = new StringManipulator();
        String res = stringManipulator.concatSubstring("Hola", 1, 3, "mundo");
        assertEquals("olmundo", res);

    }


}
