import java.util.Scanner;
class calculator{
    public int add(int n1,int n2){
        return n1 +n2;
    }
}

class lpu{
    public static void main(String[] args) {
            // int n1=10;
            // int n2=77;
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter no:");
            int n1=sc.nextInt();
            System.out.println("Enter no:");

            int n2=sc.nextInt();
            calculator cal= new calculator();
            System.out.println(cal.add(n1,n2));

    }
}