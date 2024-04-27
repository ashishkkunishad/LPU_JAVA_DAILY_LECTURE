
//try with multi. catch
//try-with-resource

import java.util.Scanner;

class lpu{
    public static void main(String args[]){
        int k,j=12;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no: ");
        int a=sc.nextInt();

        try{
            k=j/a;
            System.out.println(k);

        }

        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("By");
            sc.close();

        }

    }
}