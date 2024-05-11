import java.util.Scanner;

/* There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. 
Given two strings, write a function to check if they are one edit (or zero edits) away */

public class OneAway {
    public boolean IsOneAway(String cadena1, String cadena2){
        if(cadena1.length() == cadena2.length())
            return reemplazo(cadena1, cadena2);
        
        if(cadena1.length()+1 == cadena2.length())
            return insertar(cadena1, cadena2);  
            
        if(cadena2.length()+1 == cadena1.length())
            return insertar(cadena2, cadena1); 
        return false;    
    }

    boolean insertar(String cadena1, String cadena2){
        int index1 = 0;
        int index2 = 0;
        while (index1 < cadena1.length()) {
            if (cadena1.charAt(index1) != cadena2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    boolean reemplazo(String cadena1, String cadena2){
        boolean findDiff = false;
        for(int i = 0; i < cadena1.length(); i++){
            if(cadena1.charAt(i) != cadena2.charAt(i)){
                if(findDiff){
                    return false;
                }
                findDiff = true;
            }
        }
        return findDiff;
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        OneAway oa = new OneAway();
        System.out.print("Ingrese dos palabras: ");
        String c1 = sn.nextLine();
        String c2 = sn.nextLine();
        System.out.println(oa.IsOneAway(c1, c2));
    }
}