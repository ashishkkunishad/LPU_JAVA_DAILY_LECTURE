class add{
    public void sum(int num1,int num2){//sum()--> is a method and num1 and num2 are parameters
        System.out.println(num2 + num1);
    }

    public double  sum(double num5, double num6){//method overloading 
        return num5*num6;

    }



    public void sub(int num3,int num4){
        System.out.println(num3-num4);
    }

}



class o{
    public static void main(String args[]){
        int n1=2,n2=3,n3=7,n4=8;
       double n5=6.6,n6=3.4;
        

        add obj=new add();//creating reference object i.e obj of class add and add behind obj is type of class
        obj.sub(n1,n2);
        double result=obj.sum(n5,n6);
        System.out.println(result);







    }
}