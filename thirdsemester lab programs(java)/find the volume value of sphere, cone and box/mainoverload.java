import java.util.Scanner;
class volume_overload{
double volume(double a){
return 1.333*3.14*a*a*a;
}
double volume(float a, float b){
return 0.333*3.14*a*a*b;
}
int volume(int a, int b, int c){
return a*b*c;
}
}
class mainoverload{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
volume_overload v=new volume_overload();
System.out.println("Enter r value for sphere");
double r=sc.nextDouble();
System.out.println("Enter r and h value for cone");
float r1=sc.nextFloat();
float h=sc.nextFloat();
System.out.println("Enter l , b, h value for box");
int l=sc.nextInt();
int b=sc.nextInt();
int h1=sc.nextInt();
System.out.println("Volume of sphere is "+ v.volume(r));
System.out.println("Volume of cone is "+ v.volume(r1,h));
System.out.println("Volume of box is "+ v.volume(l,b,h1));
}
}
