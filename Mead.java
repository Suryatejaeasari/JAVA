import java.util.Random;
class Even implements Runnable{
public int x;
public Even(int x){
this.x = x;
}
public void run(){
System.out.println("Even: "+x*x);
}
}
class Odd implements Runnable{
public int x;
public Odd(int x){
this.x = x;
}
public void run(){
System.out.println("Odd: "+x*x*x);
}
}
class A implements Runnable{
public String tname;
public Random r;
public Thread t1, t2;
public A(String s){
tname = s;
}
public void run(){
int num=0;
r = new Random();
for (int i=0; i<5; i++){
num = r.nextInt(100);
System.out.println("Number: "+num);
if (num%2==0){
t1 = new Thread(new Even(num));
t1.start();
}
else{
t2 = new Thread(new Odd(num));
t2.start();
}
try{
Thread.sleep(1000);
}catch(InterruptedException ex){
System.out.println(ex.getMessage());
}
}
}
}
public class Mead{
public static void main(String[] args){
A a = new A("One");
Thread t = new Thread(a);
t.start();
}
}