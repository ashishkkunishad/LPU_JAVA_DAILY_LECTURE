class gen<T>{
    T value;
    public void show(){
        System.out.println(value.getClass());
    }
}



class lpu{
    public static void main(String args[]){
        gen<Double> obj= new gen<Double>();
        obj.value=5.5;
        obj.show();

    }
}