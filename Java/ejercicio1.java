import java.util.*;

/* Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?  */

class Word{
    boolean IsUnique(String word){
        boolean bandera = false;
    
        for(int i = 0; i < word.length(); i++){
            for(int j = i + 1; j < word.length(); j++){
                if(word.charAt(i) == word.charAt(j))
                    bandera = true;
    
            }
        }
        return bandera;
    }

    public static void main(String args[]){
        Word nuevaPalabra = new Word();
        Scanner lectura = new Scanner (System.in);
        System.out.print("Ingresa una palabra");
        String palabra = lectura.next();
        System.out.println(nuevaPalabra.IsUnique(palabra));
    }
}

