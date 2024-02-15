 class strr {
    public static void main(String[] args){
        //StringBuffer// string builder
        StringBuffer obj1=new StringBuffer("Hello");
        System.out.println(obj1.capacity());//by default StringBuffer having  16 empty space size and capacity() gives 
                                            // the size of buffer

        obj1.append("World");//now String muttted tp HelloWorld and its not concanated
        System.out.println(obj1);
        System.out.println(obj1.insert(3,"aaa"));
        System.out.println(obj1.length());
        System.out.println(obj1.replace(1, 3, "bbb"));
        System.out.println(obj1.delete(1, 3));
        System.out.println(obj1.reverse());
        System.out.println(obj1.capacity());

    }   
    
}
