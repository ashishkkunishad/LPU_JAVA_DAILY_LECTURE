class Student{
    public String name;
    public int id;
    public static String uniName;
    
    public void output(){
    System.out.println("Name : " + name + " ID : " + id + " university : " + uniName);
    }
    public static void myStaticmethod(Student obj){
        System.out.println("From static method : " + obj.id);//cannot access id directly beacuse 
                                                            //myStaticmethod is static and cannot
                                                    //access not static object from static method

        System.out.println("From static method : " + uniName);//can access uniname directly because
                                                            // uniname and myStaticmethod both are static


    }


    }
    
    
    class LPU{
    public static void main(String args[]){//can be written--> static public void main() also, interchangeable
                                            // void always comes before main
    Student s1 = new Student();
    Student.uniName="Lpu";
    s1.name = "Aanand";
    s1.id = 1;
    //s1.uniName = "LPU";
    
    Student s2 = new Student();
    s2.name = "Azhar";
    s2.id = 2;
    //s2.uniName = "LPU";
    //Student s=new Student();
    s1.output();
    s2.output();
    Student.myStaticmethod(s2);
    
    }
    }