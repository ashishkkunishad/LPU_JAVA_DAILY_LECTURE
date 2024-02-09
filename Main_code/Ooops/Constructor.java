 class Constructor {
    public String name;
    public int age;
    public int mob;

    public Constructor(){
        System.out.println("Default Constructor ");
    }

    
    public Constructor(String name,int age){
        System.out.println("constructor is called 1");
       this.name=name;
       this.age=age;

    }

    public Constructor(Constructor c){
        this.name=c.name;
    }

    public Constructor(String name,int age,int mob){
        System.out.println("constructor is called 2");
       this.name=name;
       this.age=age;
       this.mob=mob;

    }
    
}

class cons{
    public static void main(String a[]){
        Constructor c1=new Constructor("khushi",20);
        Constructor c2=new Constructor();
        Constructor c3=new Constructor("akn",21,678);
        Constructor c4=new Constructor(c1);

        


        System.out.println(c1.age);
        System.out.println(c2.age);
        System.out.println("c=: "+ c4.name);
        System.out.println("name = " +c3.name+ " :: age = "+ c3.age + ":: mobile no.= "+  c3.mob);


    }
}