class lpu{
    public static void main(String args[]){
        int arr[] = new int[5];

        try{
            //int a=2/0;
            System.out.println(arr[9]);

        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("After");
    }
}