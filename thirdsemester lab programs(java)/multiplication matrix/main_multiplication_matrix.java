import java.io.*;
class multiplication_matrix{
int a[][]=new int[10][10];
int b[][]=new int[10][10];
int c[][]=new int[10][10];
int i,j,k,r1,r2,c1,c2;
void getdata() throws IOException{
DataInputStream ds= new DataInputStream(System.in);
System.out.println("enter first matrix row and coloumn");
r1=Integer.parseInt(ds.readLine());
c1=Integer.parseInt(ds.readLine());
System.out.println("enter second matrix row and coloumn");
r2=Integer.parseInt(ds.readLine());
c2=Integer.parseInt(ds.readLine());
if(c1==r2){
System.out.println("enter first matrix elements");
for(i=1;i<=r1;i++){
for(j=1;j<=c1;j++){
a[i][j]=Integer.parseInt(ds.readLine());
}
}
System.out.println("enter second matrix elements");
for(i=1;i<=r2;i++){
for(j=1;j<=c2;j++){
b[i][j]=Integer.parseInt(ds.readLine());
}
}
}
}
void putdata(){
System.out.println("enter first matrix elements");
for(i=1;i<=c1;i++){
for(j=1;j<=r2;j++){
c[i][j]=0;
for(k=1;k<=c1;k++){
c[i][j]=c[i][j]+a[k][j]*b[i][k];
}
}
}
System.out.println("Multiplication matrix");
for(i=1;i<=r2;i++){
for(j=1;j<=c2;j++){
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
}
class main_multiplication_matrix{
public static void main(String args[])throws IOException{
multiplication_matrix m=new multiplication_matrix();
m.getdata();
m.putdata();
}
}


