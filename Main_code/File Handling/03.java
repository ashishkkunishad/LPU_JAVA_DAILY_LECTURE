import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
class lpu{
    public static void main(String[] args) {
        //File file=new File("MyFile.txt");
        try{
        FileWriter fw = new FileWriter("MyFile.txt");
        fw.write("Hello this is demo text i am writing again.");
        fw.close();
        System.out.println("Successful");
        }
        catch(IOException e){
            System.out.println(e);
        }
        

    }
}