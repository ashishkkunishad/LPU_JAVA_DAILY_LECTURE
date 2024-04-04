import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

class lpu{
    public static void main(String[] args) {

        //converting arraylist to array
        // ArrayList<String> ar1=new ArrayList<>();
        // ar1.add("Book");
        // ar1.add("table");
        // ar1.add("pen");
        // System.out.println(ar1);

        // String arr[]= new String[ar1.size()];
        // ar1.toArray(arr);

        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }

        //convert array to arraylist
        // String arr[]={"Book","Tanle","Pen"};
        //  for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        // ArrayList<String> l1= new ArrayList<>(Arrays.asList(arr));
        // System.out.println(l1);

        //Write a program to shuffle elements in a linkedlist

        //LinkedList<Object> ar1=new LinkedList<>();
        HashSet<Object> ar1=new HashSet<>();

        ar1.add("Book");
        ar1.add(1);
        ar1.add('A');
        ar1.add("Polity");
        ar1.add(250);
        ar1.add("marks");
        

        System.out.println(ar1);
        //Collections.shuffle(ar1);//for shuffling the element of the LinkedList/ArrayList
        // System.out.println(ar1.size());

        //.subList for extracting the portion of arraylist/linkedlist
        //System.out.println(ar1.subList(2,4 ));





    }
}