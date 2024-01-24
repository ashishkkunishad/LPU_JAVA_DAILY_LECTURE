import java.util.Scanner;

class switch_case{
    public static void main(String args[]){
        Scanner day= new Scanner(System.in);
        System.out.println("Enter a string: ");  
        String output= day.nextLine();
        System.out.println("You have entered: " + output);             

        //String day="monday";
        switch(day){
            case "monday","tuesday","saturday", "sunday":
            System.out.println("no class");
            break;
            case "wednesday", "thursday","friday":
            System.out.println(" yes class");
            break;
            default:
            System.out.println(" error");
        
    //   output =switch(day){
    //         case "monday","tuesday","saturday", "sunday" -> "no class";
            
            
    //         case "wednesday", "thursday","friday" -> " yes class";
           
        
    //     };
        //System.out.println(output);

    }
     
    
}
}