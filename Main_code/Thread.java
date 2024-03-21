class increament{
    int a;
    void Increament(){
        a++;
    }

}

 class lp {
    public static void main(String[] args) throws InterruptedException {
        increament inc=new increament();
        Runnable obj1= ()->{
            for(int i=0;i<1000;i++){
                inc.Increament();

            }

        };
        Runnable obj2=()->{
            for(int i=0;i<1000;i++){
                inc.Increament();

            } 
        };

        Thread t1= new Thread(obj1);
        Thread t2= new Thread(obj2);
        t1.start();
        t2.start();



        }
    }

