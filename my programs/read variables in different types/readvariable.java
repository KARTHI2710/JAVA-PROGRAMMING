//different type to read variables
import java.util.Scanner;
import java.io.*;
class readvariable{
public static void main(String args[])throws IOException{
int a,b;
float c,d;
double e,f;
String s,s1;
char ch,ch1;
Scanner sc=new Scanner(System.in);
System.out.println("enter a value");
a=sc.nextInt();
System.out.println("enter c value");
c=sc.nextInt();
System.out.println("enter string");
s=sc.nextLine();
System.out.println("enter char");
s1=sc.nextLine();
DataInputStream ds= new DataInputStream(System.in);
System.out.println("enter a value");
b=Integer.parseInt(ds.readLine());
System.out.println("enter float value");
d=Float.valueOf(ds.readLine());
}}

