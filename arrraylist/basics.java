package arrraylist;
import java.util.*;
import java.util.stream.Gatherer.Integrator;
public class basics {
      public static void main(String[] args) {
       ArrayList<Integer>list =new ArrayList<>();
       list.add(10);
       list.add(780);
       list.add(30);
       list.add(10);
       list.add(60);
       list.add(23);
       list.add(50);
       list.add(10);
System.out.println(list);
System.out.println(list.get(1));
System.out.println(list.size());
Collections.sort(list);
list.add(2);
System.out.println(list);
list.remove(3);
System.out.println(list);
list.remove((Integer) 10);
      }
}