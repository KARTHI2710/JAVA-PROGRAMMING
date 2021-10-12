import java.util.Scanner;
interface sports{
float smark=50.0f;
}
class stddetails{
String name;
int rn;
Scanner sc=new Scanner(System.in);
void getdata(){
System.out.println("Enter student name");
name=sc.nextLine();
System.out.println("Enter student roll no");
rn=sc.nextInt();
}
void putdata(){
System.out.print(rn+"\t"+name+"\t");
}
}
class stdmark extends stddetails{
float m1,m2,m3;
Scanner sc=new Scanner(System.in);
void getmark(){
System.out.println("Enter mark1,mark2 and mark3");
m1=sc.nextFloat();
m2=sc.nextFloat();
m3=sc.nextFloat();
}
}
class total extends stdmark implements sports{

void display(){
float total=m1+m2+m3+smark;
System.out.println(m1+"\t"+m2+"\t"+m3+"\t"+smark+"\t"+total);
}
}
class mainclass {
public static void main(String args[]){
total t[]=new total[10];
int n,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter no of students");
n=sc.nextInt();
for(i=1;i<=n;i++){
t[i]=new total();
t[i].getdata();
t[i].getmark();
}
System.out.println("                        STUDENT DETAILS                               ");
System.out.println("roll\tname\tmark1\tmark2\tmark3\tsmark\ttotal");
System.out.println("-----------------------------------------------------------------------------");
for(i=1;i<=n;i++){
t[i].putdata();
t[i].display();
}
}
}