import java.util.Scanner;
class area{
int l,b;
Scanner sc=new Scanner(System.in);
void getdata(){
System.out.println("enter the value of l and b");
l=sc.nextInt();
b=sc.nextInt();
}
void putdata(){
System.out.println("The area of rectangle is "+ (l*b));
}
}
class volume extends area{
int h;
Scanner sc=new Scanner(System.in);
void getdata1(){
System.out.println("Enter the value of h");
h=sc.nextInt();
}
void putdata(){
super.putdata();
System.out.println("The volume of rectangle is "+ (l*b*h));
}
}
class overriding {
public static void main(String args[]){
volume v=new volume();
v.getdata();
v.getdata1();
v.putdata();
}
}


