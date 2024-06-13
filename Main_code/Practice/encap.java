class human{
   private int age;
    private String name;

    public human(int age,String name){
        this.age=age;
        this.name=name;
    }

    // public void setage(int age){
    //     this.age=age;
    // }
    // public void setname(String name){
    //     this.name=name;
    // }
    public int getage(){
        return age;
    }


    public String getname(){
        return name;
    }

}

class lpu {
    public static void main(String args[]){
        human obj= new human(11,"As");
        // obj.setage(20);
        // obj.setname("Ashish");
        System.out.println(obj.getage() +" "+obj.getname());

    }
    
}
