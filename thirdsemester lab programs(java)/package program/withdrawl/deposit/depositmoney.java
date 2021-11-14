package deposit;
import java.util.Scanner;
public class depositmoney{
Scanner s=new Scanner(System.in);
public float amt,balance=500.0f;
public int accno;
public void action1(){
System.out.println("Enter Account number");
accno = s.nextInt();
System.out.println("Balance : "+balance);
System.out.println("Enter deposit Amount ");
amt=s.nextFloat();
balance=balance+amt;
System.out.println("Current Balance : "+balance);
System.out.println("Deposit completed successfully");
}
}
