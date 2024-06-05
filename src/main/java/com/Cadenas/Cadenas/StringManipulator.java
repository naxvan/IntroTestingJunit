package com.Cadenas.Cadenas;

public class StringManipulator {
    //Elimina los espacios en blanco de ambos lados de las cadenas ingresadas y las concatena

    public String stringCorrect(String a, String b) {
        String result;

        return result = a.trim().concat(" ").concat(b.trim());

    }

    //Obtener el índice del caracter dado y devolverlo o devolver -1.
    public int getIndexOrNull(String a, String b) {
        int result = b.indexOf(a);
        return result;
    }


    public int getSubstring(String word, String subword) {
        int result = word.indexOf(subword);
        return result;
    }

//Obtener una subcadena utilizando un índice de inicio y un índice de finalización y concatenarlo con la segunda cadena de entrada en nuestro método. Puede utilizar el método substring de la clase String.


    public String concatSubstring(String str, int start, int end, String toConcat) {
        String substring = str.substring(start, end);
        return substring + toConcat;
    }


}
