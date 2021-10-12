import java.io.*;
class add_sub_matrix{
int a[][]=new int[10][10];
int b[][]=new int[10][10];
int c[][]=new int[10][10];
int d[][]=new int[10][10];
int r1,r2,c1,c2,i,j;
void getdata() throws IOException{
DataInputStream ds=new DataInputStream(System.in);
System.out.println("enter first matrix row and coloumn");
r1=Integer.parseInt(ds.readLine());
c1=Integer.parseInt(ds.readLine());
System.out.println("enter second matrix row and coloumn");
r2=Integer.parseInt(ds.readLine());
c2=Integer.parseInt(ds.readLine());
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
void putdata(){
System.out.println("Addition matrix");
for(i=1;i<=r2;i++){
for(j=1;j<=c2;j++){
c[i][j]=a[i][j]+b[i][j];
System.out.print(c[i][j]+" ");
}
System.out.println();
}
System.out.println("Subtraction matrix");
for(i=1;i<=r2;i++){
for(j=1;j<=c2;j++){
d[i][j]=a[i][j]-b[i][j];
System.out.print(d[i][j]+" ");
}
System.out.println();
}
}
}
class main_add_sub_matrix{
public static void main(String args[]) throws IOException{
add_sub_matrix a=new add_sub_matrix();
a.getdata();
a.putdata();
}
}





