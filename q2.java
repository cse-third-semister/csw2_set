package set;

import java.util.HashSet;
import java.util.Set;

public class q2 {

    public static void main(String[] args) {
        // Sample arrays 
        Integer [] arr1 = {1, 2, 3, 4, 5};
        Integer [] arr2 = {3, 4, 5, 6, 7};

       




   
        Set<Integer> commonElements = findCommonElements(arr1, arr2);

       
       
            for (int element : commonElements) {
                System.out.print(element + " ");
            
            }
    }

    public static <t> Set<t> findCommonElements(t[] arr1, t[] arr2) {
        Set<t> set1 = new HashSet<>();
        Set<t> set2 = new HashSet<>();

        
        for (t element : arr1) {
            set1.add(element);
        }
        for (t element : arr2) {
            set2.add(element);
        }
        set1.retainAll(set2);

     
       

        return set1;
    }
}

