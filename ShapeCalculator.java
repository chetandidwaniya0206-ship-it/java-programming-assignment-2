import java.io.*;

abstract class Shape{
abstract void calculateArea();
abstract void calculatePerimeter();
}

class Circle extends Shape{
double r;

Circle(double r){
this.r=r;
}

void calculateArea(){
System.out.println("Circle Area: "+(3.14*r*r));
}

void calculatePerimeter(){
System.out.println("Circle Perimeter: "+(2*3.14*r));
}
}

class Rectangle extends Shape{
double length;
double breadth;

Rectangle(double length,double breadth){
this.length=length;
this.breadth=breadth;
}

void calculateArea(){
System.out.println("Rectangle Area: "+(length*breadth));
}

void calculatePerimeter(){
System.out.println("Rectangle Perimeter: "+(2*(length+breadth)));
}
}

class Triangle extends Shape{
double base;
double height;
double side1;
double side2;
double side3;

Triangle(double base,double height,double side1,double side2,double side3){
this.base=base;
this.height=height;
this.side1=side1;
this.side2=side2;
this.side3=side3;
}

void calculateArea(){
System.out.println("Triangle Area: "+(0.5*base*height));
}

void calculatePerimeter(){
System.out.println("Triangle Perimeter: "+(side1+side2+side3));
}
}

class ShapeCalculator{
public static void main(String a[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.print("Enter Circle Radius: ");
double r=Double.parseDouble(br.readLine());

System.out.print("Enter Rectangle Length: ");
double length=Double.parseDouble(br.readLine());

System.out.print("Enter Rectangle Breadth: ");
double breadth=Double.parseDouble(br.readLine());

System.out.print("Enter Triangle Base: ");
double base=Double.parseDouble(br.readLine());

System.out.print("Enter Triangle Height: ");
double height=Double.parseDouble(br.readLine());

System.out.print("Enter Triangle Side 1: ");
double side1=Double.parseDouble(br.readLine());

System.out.print("Enter Triangle Side 2: ");
double side2=Double.parseDouble(br.readLine());

System.out.print("Enter Triangle Side 3: ");
double side3=Double.parseDouble(br.readLine());

Shape s[]=new Shape[3];

s[0]=new Circle(r);
s[1]=new Rectangle(length,breadth);
s[2]=new Triangle(base,height,side1,side2,side3);

System.out.println("\nCircle:");
s[0].calculateArea();
s[0].calculatePerimeter();

System.out.println("\nRectangle:");
s[1].calculateArea();
s[1].calculatePerimeter();

System.out.println("\nTriangle:");
s[2].calculateArea();
s[2].calculatePerimeter();
}
}