class lpu{
    public static void main(String args[]){
        int a=2,b;
        try{
             b=a/0;
        }
        catch(Exception e){
            System.out.println("do not divide by zero");
        }
       
        System.out.println(a);
    }
}