import java.io.*;

interface Payment{
void makePayment(double amount);
void paymentDetails();
}

class CreditCardPayment implements Payment{
String cardNumber;
String cardHolderName;

CreditCardPayment(String number,String name){
cardNumber=number;
cardHolderName=name;
}

public void makePayment(double amount){
System.out.println("Payment Successful!");
System.out.println("Payment Mode: Credit Card");
System.out.println("Card Number: "+cardNumber);
System.out.println("Card Holder: "+cardHolderName);
System.out.println("Amount: Rs. "+amount);
}

public void paymentDetails(){
System.out.println("Credit Card Payment");
}
}

class UPIPayment implements Payment{
String upiId;
String userName;

UPIPayment(String id,String name){
upiId=id;
userName=name;
}

public void makePayment(double amount){
System.out.println("Payment Successful!");
System.out.println("Payment Mode: UPI");
System.out.println("UPI ID: "+upiId);
System.out.println("User Name: "+userName);
System.out.println("Amount: Rs. "+amount);
}

public void paymentDetails(){
System.out.println("UPI Payment");
}
}

class CashPayment implements Payment{
String customerName;

CashPayment(String name){
customerName=name;
}

public void makePayment(double amount){
System.out.println("Payment Successful!");
System.out.println("Payment Mode: Cash");
System.out.println("Customer Name: "+customerName);
System.out.println("Amount: Rs. "+amount);
}

public void paymentDetails(){
System.out.println("Cash Payment");
}
}

class PaymentSystem{
public static void main(String a[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("----- PAYMENT SYSTEM -----");
System.out.println("1. Credit Card");
System.out.println("2. UPI");
System.out.println("3. Cash");

System.out.print("Enter Choice: ");
int choice=Integer.parseInt(br.readLine());

Payment p;

System.out.print("Enter Amount: ");
double amount=Double.parseDouble(br.readLine());

if(choice==1){
System.out.print("Enter Card Number: ");
String number=br.readLine();

System.out.print("Enter Card Holder Name: ");
String name=br.readLine();

p=new CreditCardPayment(number,name);
}
else if(choice==2){
System.out.print("Enter UPI ID: ");
String id=br.readLine();

System.out.print("Enter User Name: ");
String name=br.readLine();

p=new UPIPayment(id,name);
}
else{
System.out.print("Enter Customer Name: ");
String name=br.readLine();

p=new CashPayment(name);
}

p.makePayment(amount);
p.paymentDetails();
}
}