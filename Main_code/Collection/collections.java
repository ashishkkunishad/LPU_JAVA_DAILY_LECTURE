//Collections gives dynamic array
import java.util.*;

class lpu{
    public static void main(String[] args) {
        //static array
        // Object value[]= new Object[4];
        // value[0]="Ashish";
        // value[1]=20;
        // System.out.println(value[0]+" "+value[1]);
        ArrayList<Integer> obj= new ArrayList<>();
        //obj.add("Ashish");
        obj.add(20);
        // obj.add("LPU");
        //obj.add(1.2f);
        // obj.add("Khushi");
        obj.add(25);
        obj.add(2);
        obj.add(15);
       Collections.sort(obj,Collections.reverseOrder());


        // Iterator i= obj.iterator();

        // while(i.hasNext()){
        //     System.out.println(i.next());
        // }

        for(int i=0;i<obj.size();i++){
            System.out.println(obj.get(i));
        }


        
    }
}