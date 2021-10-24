import java.util.Scanner;
class swap{
public static void main(String args[]){
int a,b,t;
Scanner sc=new Scanner(System.in);
System.out.println("Enter two number ");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("before swapping a = "+a+" b = "+b);
t=a;
a=b;
b=t;
System.out.println("After swapping a = "+a+" b = "+b);
}
}
