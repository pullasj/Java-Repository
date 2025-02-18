import java.util.*;
public class LinkedL {
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(32);
        linkedList.add(3223);
        linkedList.add(32321);
        linkedList.add(32342);
        linkedList.remove(2);
        Integer x = linkedList.get(2);
        System.out.println(x);
        for(Integer i: linkedList){
            System.out.println(i);
        }
    }
}
