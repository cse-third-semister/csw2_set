package set;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the list of email addresses (one address per line, type 'done' to finish):");
        Set<String> emailSet = new LinkedHashSet<>();
        String email;
        while (!(email = scanner.nextLine()).equals("done")) {
           
            String emailPrefix = email.split("@")[0];
           
            emailSet.add(emailPrefix);
        }
        scanner.close();
        
        
        System.out.println("Modified Set (Unique Email Prefixes): " + emailSet);
    }
    
}
