 class a{
    public void pattern(){
        for(int i =0;i<5;i++){
            for(int j =0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println("");

        }

    }
 }
 
 
 class ca_practice {
    public static void main(String args[]){
        a obj=new a();
       //obj.pattern();
       int a=5;
       float b=6.22f;
       float c=a+b;
       System.out.printf("%.2f",c);

       

    }
    
}
