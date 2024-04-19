import java.io.File;

class lpu{
    public static void main(String[] args) {

        File file = new File("MyFile.txt");
        if(file.exists()){
            System.out.println(file.getAbsolutePath());
            System.out.println(file.canRead());
            System.out.println(file.length());
        }

    }
}