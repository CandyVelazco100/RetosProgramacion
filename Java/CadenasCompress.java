import java.util.*;
/* Implement a method to perform basic string compression using the counts
of repeated characters*/

class CadenasCompress {
    public String comprension(String str){
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
        }

        StringBuilder compressString = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            compressString.append(entry.getKey());
            compressString.append(entry.getValue());
        }

        if (compressString.length() < str.length()) {
            return compressString.toString();
        } else {
            return str;
        }
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        CadenasCompress cc = new CadenasCompress();
        System.out.print("Ingrese una palabra: ");
        String c1 = sn.nextLine();
        System.out.println(cc.comprension(c1));
    }
}
