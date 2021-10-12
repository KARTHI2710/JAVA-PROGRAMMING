import java.util.Scanner;
class A{
void area(int a){
System.out.println("Area of square is "+a*a);
}
}
class B extends A{
void area(int l,int b){
System.out.println("Area of Rectangle is "+l*b);
}
}
class C extends A{
void area(int r){
System.out.println("Area of circle is "+3.14*r*r);
}
}
class mainclass{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
A x=new A();
B y=new B();
C z=new C();
A a;
a=x;
a=y;
a=z;
int a1,l,b,r;
System.out.println("Enter side value of square");
a1=sc.nextInt();
System.out.println("Enter l and b value");
l=sc.nextInt();
b=sc.nextInt();
System.out.println("Enter r value");
r=sc.nextInt();
x.area(a1);
y.area(l,b);
z.area(r);
}
}
