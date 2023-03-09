import java.io.*;
public class File{
public static void main(String[] args){
try{
File file = new File(fib.txt);
FileReader fr = new FileReader(file);
BufferedReader br = new BufferedReader(file);
int cc=0, lc = 0, wc = 0;
String L;
while((L = br.readLine())!=null){
lc+=1;
wc +=L.length();
String[] w = L.split("\\s+");
cc += w.length();
}
System.out.println(lc);
System.out.println(wc);
System.out.println(cc);
}catch(IOException e){
System.out.println("Error");
e.PrintStack();
}
}
}