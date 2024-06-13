class A{
    int age;
    public void show(){
        System.out.println("from A");
    }


    class B{
        public void row(){
            System.out.println("from B");
        }
    }
}

class lpu{
    public static void main(String[] args) {
        A obj= new A();
        obj.show();
        A.B obj1 = obj.new B();
        obj1.row();
    }
}