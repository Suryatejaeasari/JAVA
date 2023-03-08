import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.io.*;
public class FF{
public static void main(String[] args){
try{
FileInputStream in = new FileInputStream("Fib.txt");
FileOutputStream out = new FileOutputStream("Fib.txt", true);
String str = "Hello Frends";
out.write(str.getBytes(StandardCharsets.UTF_8));
out.close();
int c;
while((c = in.read())!= -1){
System.out.print((char)c);
}
in.close();
}catch(IOException e){
System.out.print("Error");
}
}
}