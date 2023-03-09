import java.util.Scanner;
public class Root{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
Double r1, r2;
Double a = sc.nextDouble();
Double b = sc.nextDouble();
Double c = sc.nextDouble();
Double det = b*b-4*a*c;
if(det ==0){
r1 = -b/(2*a);
System.out.format("Roots are %.2f", r1);
}
else if (det >0){
r1 = (-b + (Math.sqrt(det)))/(2*a);
r2 = (-b - (Math.sqrt(det)))/(2*a);
System.out.format("Root1 is %.2f, Root2 is %.2f", r1, r2);
}
else{
r1 = -b/(2*a);
r2 = Math.sqrt(-det)/(2*a);
System.out.format("%.2f+%.2fi",r1,r2);
System.out.format("%.2f-%.2fi",r1,r2);
}
}}