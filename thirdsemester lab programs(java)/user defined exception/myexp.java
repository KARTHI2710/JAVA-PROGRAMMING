import java.util.Scanner;
class MyException extends Exception{
MyException(String msg){
super(msg);
}
}
public class myexp{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int x[]=new int[5];
int i,a=1;
System.out.println("Enter five subjects marks of the student");
for(i=0;i<5;i++){
x[i]=s.nextInt();
}
for(i=0;i<5;i++){
try{
if(x[i]>100){
a=i;
throw new MyException("Marks out of Bound Exception");
}
else{
a=6;
}
}
catch(MyException e){
System.out.println("Caught my exception");
System.out.println(e.getMessage());
}
if(a!=6){
System.out.println("Enter valid mark Insted of "+x[a]);
x[a]=s.nextInt();
}
}
System.out.println("The total is " + (x[0]+x[1]+x[2]+x[3]+x[4]));
}
}