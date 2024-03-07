package set;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class q5 {
    public static Set<Integer> generateRandomSet(int size, int min, int max) {
        Random random = new Random();
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(random.nextInt(max - min + 1) + min);
        }
        return set;
    }

    public static void main(String[] args) {
        Set<Integer> numbers = generateRandomSet(5, 1, 21); 
        
   
        System.out.println("Original Set: " + numbers);
        
       
        Set<Integer> modifiedSet = new LinkedHashSet<>();
        for (int num : numbers) {
            if (num % 2 != 0) {
                modifiedSet.add(num);
            }
        }
        
      
        System.out.println("Modified Set (Odd Numbers Only): " + modifiedSet);
        
    }
    
}
