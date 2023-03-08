class Test{
int i,j;
Test(int a, int b){
i = a;
j = b;
}
void show(){
System.out.println("i, j : "+i+", "+j);
}
}
class B extends Test{
int k;
B (int a ,int b, int c){
super(a,b);
k = c;
}
void show(){
super.show();
System.out.println("k : "+ k);
}
}
public class Mthover{
public static void main(String[] args){
B b = new B(10, 20, 30);
b.show();
}
}
