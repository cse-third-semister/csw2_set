package set;

import java.util.*;

public class q4 {
    public static boolean isPalindrome(String str) {

       

        HashSet<Character> set = new HashSet<>();

        for (char c : str.toCharArray()) {

            if (set.contains(c)) {
                set.remove(c);
            } else {

                set.add(c);
            }
        }
        return set.size()<=1;
    }

    public static void main(String[] args) {
        String s = "abcdba";

        
        System.out.println(isPalindrome(s));

    }

}
