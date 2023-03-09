abstract class shape{
public int x,y;
public void PrintArea();
}
class Rectangle extends shape{
public void PrintArea(){
System.out.println("Area: "+x*y);
}
}
class Circle extends shape{
public void PrintArea(){
System.out.println("Area: "+(22*x*x)/7);
}
}
class Triangle extends shape{
public voie PrintArea(){
System.out.println("Area: "+(x*y)/2);
}
}
public class Abs{
public static void main(String[] args){
Rectangle r = new Rectangle();
r.x = 10;
r.y = 20;
r.PrintArea();
Circle c = new Circle();
c.x = 2
c.PrintArea();
Triangle t = new Triangle();
t.x = 30;
t.y = 35;
t.PrintArea();
}}
