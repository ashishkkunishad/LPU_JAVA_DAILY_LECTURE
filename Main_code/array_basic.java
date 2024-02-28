 import java.util.Scanner;

 class array_basic {
    public static void main(String args[]){
        /* //1D array
        int marks[]={11,33,44,55,22,44};
       // System.out.println(marks.length);
       String name[]={"ashish","khushi","ghinni","surri"};
       //System.out.println(name.length);
       System.out.print("Printing the array: ");
       for(int i=0;i<name.length;i++){
        System.out.print(name[i]+" ");
       }
       System.out.println();
       System.out.print("Printing the array in reverse order: ");

       for(int i=name.length-1;i>=0;i--){
        System.out.print(name[i]+" ");
       }
       */

       //multidimensional array
       Scanner scanner=new Scanner(System.in);
       System.out.print("Enter m: ");
       int m=scanner.nextInt();
       System.out.print("enter n: ");
       int n=scanner.nextInt();

       int flats[][]=new int[m][n];
    //    flats[0][0]=101;
    //    flats[0][1]=102;
    //    flats[0][2]=103;
    //    flats[1][0]=201;
    //    flats[1][1]=202;
    //    flats[1][2]=203;

       for(int i=0;i<flats.length;i++){
        for(int j=0;j<flats[i].length;j++){
            flats[i][j]=scanner.nextInt();
            System.out.print(" ");
        }
        System.out.println("");
       }


       System.out.println("length of array: "+flats.length);
       for(int i=0;i<flats.length;i++){
        for(int j=0;j<flats[i].length;j++){
            System.out.print(flats[i][j]);
            System.out.print(" ");

        }
        System.out.println(" ");
       }



    }
    
}
