class MyCustomException extends Throwable{
            public MyCustomException(String str){
                super(str);
            }
}

class lpuu{
    public static void main(String[] args) {
        int i=100;
        int j=0;
        try{
            j=10/1;

            if(j==0){
               // throw new ArithmeticException("output zero is not accept");

               throw new MyCustomException("hello");
            }

        }
        catch(MyCustomException e){
            System.out.println("From my exception"+e);
        }
        catch(ArithmeticException e){
            j=10/1;

            System.out.println("default value is " +e);
        }
        System.out.println(j);
    }
}