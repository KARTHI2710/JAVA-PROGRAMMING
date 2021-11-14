import java.awt.*;
import java.applet.*;
/*<applet code="strapplet" height="200" width="200">  </applet>*/
public class strapplet extends Applet{
TextField t1;
public void init(){
t1=new TextField(10);
add(t1);
}
public void paint(Graphics g){
String a = t1.getText();
g.drawString("you have entered test",100,100);
g.drawString(a,100,120);
}
public boolean action(Event event,Object obj){
repaint();
return true;
}
}
