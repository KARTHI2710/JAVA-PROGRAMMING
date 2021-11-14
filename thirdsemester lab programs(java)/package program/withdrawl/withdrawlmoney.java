package withdrawl;
import deposit.depositmoney;
import java.util.Scanner;
public class withdrawlmoney extends depositmoney{
float amt;
int accno;
Scanner s=new Scanner(System.in);
public void action2(){
System.out.println("Enter Account number");
accno=s.nextInt();
System.out.println("Balance : "+super.balance);
System.out.println("enter withdarwl amount");
amt=s.nextFloat();
if(amt>super.balance){
System.out.println("Insufficiant balance");
}
else{
System.out.println("Current balance : "+(super.balance-amt));
}
System.out.println("Withdrawl complete successfully");
}
}


