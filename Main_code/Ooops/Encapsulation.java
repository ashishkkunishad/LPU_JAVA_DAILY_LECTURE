import java.util.Scanner; // Import the Scanner class


class account{
    private String name;
    private int balance;
    private int number;


    public String getname(){
        return name;
    }

    public int getbalance(){
        return balance;
    }

    public int getnumber(){
        return number;
    }
  
  

    public void setname(String names){
        name=names;

    }

    public void setbalance(int balances){
        balance=balances;

    }

    public void setnumber(int numbers){
    number=numbers;
    }
}




class encap {
    public static void main(String args[] ){
        //encapsulation
        Scanner sc = new Scanner(System.in);// Create a Scanner object
        System.out.print("Enter name : ");
        String names = sc.nextLine();
        System.out.print("Enter balances : ");
        int balances = sc.nextInt();
        System.out.print("Enter numbers : ");
        int numbers=sc.nextInt();
       
    account a1 =new account();

    a1.setname(names);
    a1.setbalance(balances);
    a1.setnumber(numbers);
    System.out.println("Get name : "+a1.getname());
    System.out.println("Get balance"+a1.getbalance());
    System.out.println("Get number"+a1.getnumber());

    

   

    }
    
}

