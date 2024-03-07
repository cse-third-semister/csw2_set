package set;

import java.util.*;

public class q9 {
    public static void main(String[] args) {
        String s = "afgfzbh";
        Set<Character> obj = new TreeSet<>();
        for(char arr:s.toCharArray()){
            if(obj.contains(arr)){
                obj.remove(arr);
            }
            else {
                obj.add(arr);
            }
        }
        System.out.println(obj);


    }
    
}
