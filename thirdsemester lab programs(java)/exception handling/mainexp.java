import java.util.Scanner;
class mainexp{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
int a[]=new int[2];
int b,y,x,x1;
try{
System.out.println("Enter two numbers : ");
a[0]=s.nextInt();
a[1]=s.nextInt();
System.out.println("Enter a integer value of divide :");
b=s.nextInt();
x=a[0]/b+a[1];
System.out.println("x = "+ x);
x1=a[1]/b+a[2];
System.out.println("X1 = " + x1);
}
catch(ArithmeticException e){
System.out.println("Cannot divided by zero ");
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("Array index error");
}
finally{
y=a[0]/a[1];
System.out.println("Y = "+y);
}
}
}