import java.text.DecimalFormat;
class arth{
    public static void main(String args[]){
        int num1=5;
        int num2=8;
        // int sum=num2+num1;
        // int sub=num2-num1;
        // double div=num2/num2;
        // int mul=num1*num2;
        // int mod=num1%num2;
        // System.out.println(sum);
        // System.out.println(sub);
        // System.out.println(div);
        // System.out.println(mul); 
        // num1++;
        // System.out.println(num1);
        // int output=num1++;
        // System.out.println(num1);

        float n1=20;
        float n2=3;
        float n3 =n1/n2;
        System.err.printf("here is the no: %.1f\n",n3);
        DecimalFormat df= new DecimalFormat(".0");

        System.out.println("by decimalformat: "+df.format(n3));
        


    }
}