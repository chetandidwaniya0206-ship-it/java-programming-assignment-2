import java.io.*;

class BankAccount{
int accountNumber;
String accountHolderName;
double balance;

BankAccount(){
accountNumber=0;
accountHolderName="Unknown";
balance=0;
}

BankAccount(int number,String name,double amount){
accountNumber=number;
accountHolderName=name;
balance=amount;
}

void deposit(double amount){
balance=balance+amount;
}

void withdraw(double amount){
if(amount<=balance)
balance=balance-amount;
else
System.out.println("Insufficient Balance");
}

void displayAccount(){
System.out.println("Account Number: "+accountNumber);
System.out.println("Account Holder: "+accountHolderName);
System.out.println("Balance: "+balance);
}

public static void main(String a[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

BankAccount b1=new BankAccount();

System.out.println("Default Account:");
b1.displayAccount();

System.out.println("\nEnter details for second account:");

System.out.print("Account Number: ");
int number=Integer.parseInt(br.readLine());

System.out.print("Account Holder: ");
String name=br.readLine();

System.out.print("Balance: ");
double amount=Double.parseDouble(br.readLine());

BankAccount b2=new BankAccount(number,name,amount);

System.out.print("Deposit Amount: ");
double depositAmount=Double.parseDouble(br.readLine());
b2.deposit(depositAmount);

System.out.print("Withdraw Amount: ");
double withdrawAmount=Double.parseDouble(br.readLine());
b2.withdraw(withdrawAmount);

System.out.println("\nUpdated Account:");
b2.displayAccount();
}
}