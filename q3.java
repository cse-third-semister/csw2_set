package set;

import java.util.HashSet;
import java.util.Set;

public class q3 {
    public static  <t> void intersection(Set <t> obj1,Set<t> obj2 ){
        Set<t> obj3 = new HashSet<t>();
        obj1.retainAll(obj2);
        obj3.addAll(obj1);
        if(obj3.isEmpty()){
            System.out.println("not subset");
        }
        else {
            System.out.println("subset");
        }
       
       
        

    }
    public static void main(String[] args) {
        Set<Integer> obj1 = new HashSet<>();
        Set<Integer> obj2 = new HashSet<>();
        obj1.add(1);
        obj1.add(2);
        obj1.add(3);

        obj2.add(5);
        obj2.add(8);
        obj2.add(7);
        intersection( obj1, obj2 );


        
    }
    
}
