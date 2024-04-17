// class MyGenericClass<T>{
//     T data;

//     MyGenericClass(T data){
//         this.data=data;
//     }

//     T getData(){
//         return this.data;

//     }
// }
//generic method without generic class
// class Test{
//     <T> void print(T data){
//         System.out.println("Data is: "+data);
//     }
// }

class Generic<T extends Number>{
    void print(){
      
        System.out.println("Hello");
    }

}

class lpu{
    public static void main(String[] args) {
        // MyGenericClass obj1= new MyGenericClass(5);
        // MyGenericClass obj2= new MyGenericClass("Hello");


        // System.out.println(obj2.getData());
        // Test obj3 =new Test();
        // obj3.print(4.5);
        Generic<Integer> obj4= new Generic();
        obj4.print();
        
    }
}

//code reuseability: we can creayte generic method  aand used to perform 
//in differnt data types