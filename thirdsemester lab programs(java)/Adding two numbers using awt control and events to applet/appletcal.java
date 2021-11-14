import java.awt.*;
import java.applet.*;
public class appletcal extends Applet{
Label l1,l2;
TextField t1,t2;
public void init(){
l1=new Label("Number 1");
t1=new TextField(10);
l2=new Label("Number 2");
t2=new TextField(10);
add(l1);
add(t1);add(l2);add(t2);
}
public void paint(Graphics g){
int x,y,z;
String a=t1.getText();
String b=t2.getText();
x=Integer.parseInt(a);
y=Integer.parseInt(b);
z=x+y;
String result=String.valueOf(z);
g.drawString("The sum is : ",100,100);
g.drawString(result,170,100);
}
public boolean action(Event event,Object obj){
repaint();
return true;
}
}
/*<applet code="appletcal.class" height=400 width=400></applet>*/
