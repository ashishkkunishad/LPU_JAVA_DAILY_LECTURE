

class A implements Runnable{//creating thread
    public void run(){//run() should use not any other name
        for(int i=0; i<=10;i++){
        System.out.println("Task 1");

        try{
        Thread.sleep(10);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        

        }
    }
}

class B implements Runnable {
    public void run() {
        for(int i = 0; i <= 10; i++) {
            System.out.println("Task 2");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class thrrd{
    public static void main(String[] args){
        Runnable obj1= new A();
        Runnable obj2= new B();
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();

        
       


        // obj1.show();
        // obj2.show();
        

    }
}