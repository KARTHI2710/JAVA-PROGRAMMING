import java.util.Scanner;
class empdetails {
String des,name;
int eno;
void getdata(){
Scanner sc=new Scanner(System.in);

System.out.println("Enter employee designation");
des=sc.nextLine();
System.out.println("Enter employee name");
name=sc.nextLine();
System.out.println("Enter employee no");
eno=sc.nextInt();

}
void putdata(){
System.out.print(eno+"\t"+name+"\t"+des+"\t");
}
}
class empsalary extends empdetails{
float basic,da,cca,hra,pf,lic,gross,net,ded;
void getpay(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter basic salary");
basic=sc.nextFloat();
}
void putpay(){
da=basic*5/100;
hra=basic*10/100;
cca=basic*20/100;
pf=basic*5/100;
lic=basic*5/100;
gross=basic+da+cca+hra;
ded=pf+lic;
net=gross-ded;
System.out.println(basic+"\t"+da+"\t"+cca+"\t"+hra+"\t"+pf+"\t"+lic+"\t"+gross+"\t"+ded+"\t"+net);
}
}
class mainclass{
public static void main(String args[]){
empsalary e[]=new empsalary[10];
System.out.println("Enter no of employees");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++){
e[i]=new empsalary();
e[i].getdata();
e[i].getpay();
}
System.out.println("                             EMPLOYEE DETAILS                        ");
System.out.println("eno\tename\tdes\tbasic\tda\tcca\thra\tpf\tlic\tgross\tded\tnet");
System.out.println("--------------------------------------------------------------------------------------------------------");
for(int i=1;i<=n;i++){
e[i].putdata();
e[i].putpay();
}
System.out.println("--------------------------------------------------------------------------------------------------------");
}
}


 


