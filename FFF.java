import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.io.*;

public class FFF{
    public static void main(String[] args){
        try{
            FileInputStream in = new FileInputStream("Fob.txt");
            FileOutputStream out = new FileOutputStream("Fib.txt", true);
            int c;
            while((c = in.read())!= -1){
                out.write(c);
            }
            in.close();
            out.close();
            in = new FileInputStream("Fib.txt");
            while((c = in.read())!= -1 && c!='\n'){
                System.out.print((char)c);
            }
            in.close();
        }catch(IOException e){
            System.out.print("Error");
        }
    }
}