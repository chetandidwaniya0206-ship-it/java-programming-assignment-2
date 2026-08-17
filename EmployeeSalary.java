import java.io.*;

abstract class Employee{
int employeeId;
String employeeName;
double basicSalary;

Employee(int id,String name,double salary){
employeeId=id;
employeeName=name;
basicSalary=salary;
}

abstract double calculateSalary();

void display(){
System.out.println("Employee ID: "+employeeId);
System.out.println("Employee Name: "+employeeName);
System.out.println("Basic Salary: "+basicSalary);
}
}

class PermanentEmployee extends Employee{

PermanentEmployee(int id,String name,double salary){
super(id,name,salary);
}

double calculateSalary(){
double hra=basicSalary*20/100;
double da=basicSalary*40/100;
double pf=basicSalary*12/100;
double gross=basicSalary+hra+da;
return gross-pf;
}
}

class ContractEmployee extends Employee{

ContractEmployee(int id,String name,double salary){
super(id,name,salary);
}

double calculateSalary(){
return basicSalary+basicSalary*10/100;
}
}

class EmployeeSalary{
public static void main(String a[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.print("Enter Employee ID: ");
int id=Integer.parseInt(br.readLine());

System.out.print("Enter Employee Name: ");
String name=br.readLine();

System.out.print("Enter Basic Salary: ");
double salary=Double.parseDouble(br.readLine());

System.out.println("1. Permanent Employee");
System.out.println("2. Contract Employee");
System.out.print("Enter Choice: ");
int choice=Integer.parseInt(br.readLine());

Employee e;

if(choice==1)
e=new PermanentEmployee(id,name,salary);
else
e=new ContractEmployee(id,name,salary);

e.display();
System.out.println("Calculated Salary: "+e.calculateSalary());
}
}