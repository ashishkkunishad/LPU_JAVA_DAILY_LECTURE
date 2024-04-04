import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;

class lpu{
    public static void main(String[] args) {

        Deque<String> l1= new LinkedList<>(); // can add and delete from front and rear
        l1.add("mercury");
        l1.add("venus");
        l1.add("earth");
        l1.add("mars");
        //l1.add(1,"jupiter");
        
        l1.addFirst("akn");
        System.out.println(l1);

        //System.out.println(l1.get(1));
        Queue<String> l2= new LinkedList<>();//can delete from front and add from rear(end)
        l2.add("ckn");
        System.out.println(l2);

    }
}