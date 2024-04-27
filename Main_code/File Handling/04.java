import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

class lpu{
    public static void main(String[] args) {
    //     try{
    //     byte arr[]=new byte[100];
        
    //     InputStream obj1 = new FileInputStream("MyFile.txt");
    //     obj1.read(arr);

    //     String data=new String(arr);

    //     System.out.println(data);

    //     obj1.close();
    // }

    // catch(Exception e){
    //     System.out.println(e);
    // }

    try{

    String data1="Adding new line";
    OutputStream obj2 = new FileOutputStream("MyFile.txt");

    byte[] objbyte= data1.getBytes();
    obj2.write(objbyte);
    }

    catch(Exception e){
        System.out.println(e);
    }



}


}