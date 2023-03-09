import java.util.Scanner;
public class Pali{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String l = sc.nextLine();
String rev = " ";
int len = l.length();
for(int i = len-1; i>=0; i--){
rev = rev + l.charAt(i);
}
if(rev.equals(l))
System.out.println("Yes");
else
System.out.println("No");

