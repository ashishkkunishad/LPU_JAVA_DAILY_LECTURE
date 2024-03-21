class lpu{
    public static void main(String[] args) {
        try{
            //int a=2/0;
            int arr[]=new int[5];
            System.out.println("hello");
            System.out.println(arr[10]);
            System.out.println("after error");
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        System.out.println("outside try");
    }
}