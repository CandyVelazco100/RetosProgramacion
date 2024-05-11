/* Java program to check whether two strings are Permutations of each other */

import java.util.*;
class GfG{ 

	static boolean arePermutation(String str1, String str2) { 
		int n1 = str1.length(); 
		int n2 = str2.length(); 

		if (n1 != n2) 
			return false; 

		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();

		Arrays.sort(ch1); 
		Arrays.sort(ch2); 

		for (int i = 0; i < n1; i++) {
			if (ch1[i] != ch2[i])
				return false; 
		}
		return true; 
	} 

	public static void main(String[] args)  { 
        Scanner lectura = new Scanner (System.in);
        System.out.print("Ingresa una palabra: ");
        String str1 = lectura.next();
        String str2 = lectura.next();
		if (arePermutation(str1, str2)) 
		    System.out.println("Yes"); 
		else
		    System.out.println("No"); 
	}
} 
