import java.util.Scanner;
/* Assume you have a method isSubstringwhich checks if oneword is a substring of another. 
Given two strings, sl and s2, write code to check if s2 is a rotation of sl 
using only one call to isSubstring  */

public class Rotate {
    public boolean isRotation(String str1, String str2){
        if (str1 == null || str2 == null || str1.length() != str2.length()) 
            return false;

        if(str1.equals("") && str2.equals(""))
            return true;

        String str11 = str1+str1;
        return isSubstring(str11, str2);    
    }

    private boolean isSubstring(String str11, String str2){
        int len = str2.length(); 
        for(int i = 0; i < len; i++){
            System.out.println(str11.subSequence(i, i+len));
			if(str11.subSequence(i, i+len).equals(str2))
				return true;			
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Rotate r = new Rotate();
        System.out.print("Ingrese dos palabras: ");
        String c1 = sn.nextLine();
        String c2 = sn.nextLine();
        System.out.println(r.isRotation(c1, c2));
    }
}