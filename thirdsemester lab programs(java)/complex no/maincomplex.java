//complex number
//sample program
import java.io.*;
class complex{
int a1,a2,b1,b2,x,y;
void getdata() throws IOException{
DataInputStream ds=new DataInputStream(System.in);
System.out.println("Enter a1 and b1 value");
a1=Integer.parseInt(ds.readLine());
b1=Integer.parseInt(ds.readLine());
System.out.println("Enter a2 and b2 value");
a2=Integer.parseInt(ds.readLine());
b2=Integer.parseInt(ds.readLine());
}
void putdata(){
x=a1+a2;
y=b1+b2;
System.out.println("x+iy="+x+"+"+y+"i");
}
}
class maincomplex{
public static void main(String args[])throws IOException{
complex c=new complex();
c.getdata();
c.putdata();
}
}