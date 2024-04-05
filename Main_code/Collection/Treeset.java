import java.util.TreeSet;

import java.util.Iterator;

class lpu{
    public static void main(String[] args) {
        TreeSet<Integer> set1=new TreeSet<>();

        set1.add(2);
        set1.add(4);
        set1.add(5);
        set1.add(6);


        System.out.println(set1);

        // Iterator<Integer> itr= set1.iterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }

        // set1.remove(2);
        // System.out.println(set1);
       // System.out.println(set1.first());//first smallest element
       // System.out.println(set1.last());//lasthighest element
        //System.out.println(set1.higher(4));//Returns the least element in this set
                // strictly greater than the given element, or null if there is no such element
        // System.out.println(set1.lower(4));
        // System.out.println(set1.ceiling(6));
        // System.out.println(set1.floor(3));
        // System.out.println(set1.pollFirst());
        // System.out.println(set1.pollLast());
        //System.out.println(set1.headSet(5));//gives smaller no. of given no.
        //System.out.println(set1.tailSet(4));//give elements greater and equal than no.
        System.out.println(set1.subSet(2,true, 5, true));







    }
}