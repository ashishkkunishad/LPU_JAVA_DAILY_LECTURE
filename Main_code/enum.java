 enum levels{//An enum is a special "class" that represents
             // a group of constants (unchangeable variables, like final variables).
    EASY,
    MEDIUM,
    HARD,

 }
 
 
 class en {
    public static void main(String args[]){
        //enum is enumeration
        levels enumType=levels.EASY;
        //System.out.println(a1);
        switch(enumType){
            case EASY:
            System.out.println("Easy");
            break;
            case MEDIUM:
            System.out.println("medium");
            break;
            case HARD:
            System.out.println("Hard");
            break;
            default:
            System.out.println("None");
        }
       

    }
    
}
