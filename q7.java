package set;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<Integer> seenNumbers = new LinkedHashSet<>();

        System.out.println("Enter a sequence of integers (type 'done' to finish):");

        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            if(seenNumbers.contains(n)){
                System.out.println("First duplicate number is   : " + n);
                break;

            }
            else {
                seenNumbers.add(n);
            }
            
           
        }
        
        
    }

}
