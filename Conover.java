class Test{
Test (int a){
System.out.println("int args overlaod");
}
Test (int a, int b){
System.out.println("int int args overlaod");
}
Test (char a){
System.out.println("char load");
}
}
public class Conover{
public static void main(String[] args){
new Test(10);
new Test(10,20);
new Test('a');
}
}
