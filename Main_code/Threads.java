class A extends Thread{//creating thread
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

class B extends Thread{
    public void run(){
        for(int i=0; i<=10;i++){
        System.out.println("Task 2");
        }

        try{
            Thread.sleep(10);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
    }
}
class thrd{
    public static void main(String args[]){
        A obj1= new A();
        B obj2= new B();
        // System.out.println(obj1.getPriority());
        // System.out.println(obj2 .getPriority());
        obj1.setPriority(Thread.MAX_PRIORITY);

        


        obj1.start();//start should use not method
        class A extends Thread{//creating thread
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

class B extends Thread{
    public void run(){
        for(int i=0; i<=10;i++){
        System.out.println("Task 2");
        }

        try{
            Thread.sleep(10);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
    }
}
class thrd{
    public static void main(String args[]){
        A obj1= new A();
        B obj2= new B();
        // System.out.println(obj1.getPriority());
        // System.out.println(obj2 .getPriority());
        obj1.setPriority(Thread.MAX_PRIORITY);

        


        obj1.start();//start should use not method
        
        
        obj2.start();


        // obj1.show();
        // obj2.show();
        

    }
}
        obj2.start();


        // obj1.show();
        // obj2.show();
        

    }
}