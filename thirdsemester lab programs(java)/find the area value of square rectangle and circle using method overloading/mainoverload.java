import java.util.Scanner;
class area_overload{
int area(int a){
return a*a;
}
float area(float l,float b){
return l*b;
}
double area(double r){
return Math.PI*r*r;
}
}
class mainoverload{
public static void main(String args[]){
area_overload o=new area_overload();
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value for square");
int a=sc.nextInt();
System.out.println("Enter l and b value of rectangle");
float l=sc.nextFloat();
float b=sc.nextFloat();
System.out.println("Enter r value for circle");
double r=sc.nextDouble();
System.out.println("Area of square is "+ o.area(a));
System.out.println("Area of Rectangle is "+ o.area(l,b));
System.out.println("Area of Circle is "+ o.area(r));
}
}