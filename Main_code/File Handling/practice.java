import java.io.*;


class lpu{
    public static void main(String[] args) {

        try{
            File file=new File("abc.txt");
            if(file.createNewFile()){
                System.out.println("Successfully created"+file.getName());
            }
            else{
                System.out.println("Already created");

            }

            FileWriter fw=new FileWriter("abc.txt");
            fw.write("Hii");
            fw.close();
        }

        catch(IOException e){
            System.out.println(e);
        }

        InputStream is= new FileInputStream("abc.txt");
        is.read()
        
    }
}