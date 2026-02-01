import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class collection01 {
    public static void main(String[] args) {
        //hash.set
        Set<Integer>set=new HashSet<Integer>(); 
          set.add(20);
          set.add(30);
          set.add(40);
          set.add(50);
          set.add(20);
          System.out.println(set);
          //linked hash set
          LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
           lhs.add(20);
          lhs.add(30);
          lhs.add(40);
          lhs.add(50);
          lhs.add(20);
          System.out.println(lhs);
           TreeSet<Integer> tree=new TreeSet<>();
           tree.add(20);
          tree.add(70);
          tree.add(40);
          tree.add(50);
          tree.add(20);
          System.out.println("tree"+tree);
        
        
    }
} 
    

