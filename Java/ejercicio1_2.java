import java.util.*;

/* Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?  */

class Word{
	int MAX_CHAR = 256; 

	boolean uniqueCharacters(String str)
	{
		if (str.length() > MAX_CHAR)
			return false;

		boolean[] chars = new boolean[MAX_CHAR];
		Arrays.fill(chars, false);

		for (int i = 0; i < str.length(); i++) {
			int index = (int)str.charAt(i);

			if (chars[index] == true)
				return false;

			chars[index] = true;
		}

		return true;
	}

	// Driver code
	public static void main(String args[])
	{
		Word obj = new Word();
        Scanner lectura = new Scanner (System.in);
        System.out.print("Ingresa una palabra: ");
        String input = lectura.next();

		if (obj.uniqueCharacters(input))
			System.out.println("Caracteres unicos");
		else
			System.out.println("Caracteres duplicados");
	}
}
