class Newthread implements Runnable{
Thread t;
Newthread(){
t=new Thread(this,"Demo Thread");
System.out.println("child Thread : " +t);
t.start();
}
public void run(){
try{
for(int i=5;i>=1;i--){
System.out.println("child Thread : " +i);
Thread.sleep(500);
}
}
catch(InterruptedException e){
System.out.println("child Interrupted");
}
System.out.println("Exiting child Thread");
}
}
public class runnableThread{
public static void main(String args[]){
new Newthread();
try{
for(int i=5;i>=1;i--){
System.out.println("Main Thread :" +i);
Thread.sleep(5000);
}
}
catch(InterruptedException e){
System.out.println("Main interrupted");
}
System.out.println("exiting main thread");
}
}