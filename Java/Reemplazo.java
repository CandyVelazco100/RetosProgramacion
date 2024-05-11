/* Write a method to replace all spaces in a string with '%20'. You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string */

import java.util.Scanner;

public class Reemplazo {
    public String reemplazoEspacios(String str) {
        char palabras[] = str.toCharArray();
        StringBuilder sentence = new StringBuilder();

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i] == ' ') {
                sentence.append("%20");
            } else {
                sentence.append(palabras[i]);
            }
        }
        return sentence.toString();
    }

    public static void main(String[] args) {
        Reemplazo obj = new Reemplazo();
        System.out.print("Ingrese una frase o cadena: ");
        Scanner sn = new Scanner(System.in);
        String str = sn.nextLine();
        String resultado = obj.reemplazoEspacios(str);
        System.out.println(resultado);
    }
}
