class lpu{
    public static void main(String[] args) {
        
        try{
        //int a=2/0;
        System.out.println("inside try");

        String str=null;
        System.out.println(str.length());//if error get in first line then code will
        // not run after that line inside try
        }

        catch(Exception e){
            System.out.println(e);

        }
        System.out.println("outside try ");
    }
}