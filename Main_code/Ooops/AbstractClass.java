abstract class car{

    abstract void acc(){//inside abs class 


    }

    void music(){//concrete method

    }
}

class ford extends car{
    void acc(){
        System.out.println("speeding up");
    }

}
 
 class lpu{
    public static void main(String[] args) {
        car obj=new car();
        obj.acc();
        obj.music();

        
    }

    
}
