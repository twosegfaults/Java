import java.util.*;
class Collections{
    public static <T extends Comparable<T>> T max(Collection<T> xs){
        Iterator<T> xi = xs.iterator();
        T m= xi.next();
        while(xi.hasNext()){
            T temp = xi.next();
            if(m.compareTo(temp)<0){
                m= temp;
            }
        }
        return m;
    }
}
public class midsem1{
    public static void main(String args[]){
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(99);
        a1.add(2);
        a1.add(0);
        a1.add(69);
        a1.add(5);
        a1.add(420);
        a1.add(98);
        Integer ans = Collections.max(a1); 
        System.out.println("The max element in the collection is "+ ans.toString());   
    }
}