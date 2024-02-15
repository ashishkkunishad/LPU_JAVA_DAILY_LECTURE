class test{
    public int add(int...n){
        int sum=0;
        for(int i: n){
            sum+=i;
        }
        return sum;
    }
}


class varibale_argument {
    public static void main(String args[]){
        test obj=new test();
        System.out.println(obj.add(1,2,3,4,5,6,7));

    }
    
}
