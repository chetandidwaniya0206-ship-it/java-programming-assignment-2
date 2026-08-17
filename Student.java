import java.io.*;

class Student{
int rollNo;
String name;
int marks1;
int marks2;
int marks3;

void acceptDetails(BufferedReader br)throws IOException{
System.out.print("Enter Roll No: ");
rollNo=Integer.parseInt(br.readLine());

System.out.print("Enter Name: ");
name=br.readLine();

System.out.print("Enter Marks 1: ");
marks1=Integer.parseInt(br.readLine());

System.out.print("Enter Marks 2: ");
marks2=Integer.parseInt(br.readLine());

System.out.print("Enter Marks 3: ");
marks3=Integer.parseInt(br.readLine());
}

int calculateTotal(){
return marks1+marks2+marks3;
}

double calculatePercentage(){
return (double)calculateTotal()/300*100;
}

void displayResult(){
double percentage=calculatePercentage();

System.out.println("\nRoll No: "+rollNo);
System.out.println("Name: "+name);
System.out.println("Total: "+calculateTotal());
System.out.println("Percentage: "+percentage);

if(percentage>=90)
System.out.println("Grade: A+");
else if(percentage>=80)
System.out.println("Grade: A");
else if(percentage>=70)
System.out.println("Grade: B");
else if(percentage>=60)
System.out.println("Grade: C");
else if(percentage>=50)
System.out.println("Grade: D");
else
System.out.println("Grade: F");
}

public static void main(String a[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

Student s1=new Student();
Student s2=new Student();

System.out.println("Enter details of Student 1");
s1.acceptDetails(br);

System.out.println("\nEnter details of Student 2");
s2.acceptDetails(br);

System.out.println("\n--- Student 1 Result ---");
s1.displayResult();

System.out.println("\n--- Student 2 Result ---");
s2.displayResult();
}
}