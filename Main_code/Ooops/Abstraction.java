class student{
    int rollNo;
    String Subject;

    public String toString(){
        return "Student[RollNo:" + rollNo +" Subjct: " + Subject + "]";

    }

}

class lpu{
    public static void main(String[] args) {
        student obj1=new student();
        student obj2=new student();
        obj1.rollNo=11;
        obj1.Subject="java";

        obj2.rollNo=11;
        obj2.Subject="java";
        boolean ans=obj1==obj2;
        System.out.println(ans);

        //System.out.println(obj1);
    }
}