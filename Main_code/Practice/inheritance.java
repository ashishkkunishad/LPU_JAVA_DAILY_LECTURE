 class cal{
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int sub(int n1,int n2){
        return n1-n2;
    }
}

class adcal extends cal{
    public int mul(int n1,int n2){
        return n1*n2;
    }
    public int div(int n1,int n2){
        return n1/n2;
    }
}

class lpu{
    public static void main(String[] args) {
        adcal obj = new adcal();
       int r1= obj.add(5,4);
       int r2= obj.mul(8,9);
       int r3= obj.div(9,3);
       int r4= obj.sub(6, 4);

       System.out.println(r1+" "+r2+" "+r3+" " +r4);

        
    }
}
