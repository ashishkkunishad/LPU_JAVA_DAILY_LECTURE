import java.io.File;
import java.io.IOException;

class lpu{
    public static void main(String[] args) {

        //need to use try

        try{
        
        File file = new File("MyFile.txt");

        if(file.createNewFile()){
            System.out.println("File created successfully"
            + file.getName());
        }
        else{
            System.out.println("File already exist");
        }
    }

    catch(IOException e){
        System.out.println(e);
        e.getStackTrace();//give where is error going to come if there
    }
    }
}