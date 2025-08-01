1)

import java.util.Scanner;
public class lab3
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter first number");
    int a =sc.nextInt();
    System.out.println("Enter second number");
    int b =sc.nextInt();
    System.out.println("Enter third number");
    int c =sc.nextInt();
    if(a>b && a>c){
      System.out.println("A is the largest");
    }
      else if(b>a && b>c){
      System.out.println("B is the largest");
      }
    else if(c>b && c>a){
      System.out.println("C is the largest");
    }
  }
}

2)

import java.util.Scanner;
public class lab3
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter your number");
    int num = sc.nextInt();
    if(num<50){
      System.out.println("Your grade is F");
    }
    else if(num>=50 && num<=56){
      System.out.println("Your grade is D");
    }
    else if(num>=57 && num<=69){
      System.out.println("Your grade is C");
    }
    else if(num>=70 && num<=84){
      System.out.println("Your grade is B");
    }
    else if(num>=85 && num<=89){
      System.out.println("Your grade is A-");
    }
    else if(num>=90 && num<=100){
      System.out.println("Your grade is A");
    }
    else{
      System.out.println("Invalid grade");
    }
  }
}

3)

import java.util.Scanner;
public class lab3
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter first number ");
    int num1 = sc.nextInt();
    System.out.println("Enter second number ");
    int num2 = sc.nextInt();
    String operator = sc.next();
    if(operator.equals ("-")){
      System.out.println("Substraction "+ (num1-num2));
    }
    else if(operator.equals ("+")){
      System.out.println("Addition "+ (num1+num2));
    }
    else if(operator.equals ("*")){
      System.out.println("Multiplication "+ (num1*num2));
    }
    else if(operator.equals ("/")){
      System.out.println("Division "+ (num1/num2));
    }
  }
}

4)

import java.util.Scanner;
public class lab3
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter first number ");
    int num = sc.nextInt();
    if(num%5==0 && num%7==0){
      System.out.println("Divisible by both");
    }
    else if(num%5==0){
      System.out.println("Invalid: Divisible by 5 Only");
      }
    else if(num%7==0){
      System.out.println("Invalid: Divisible by 7 Only");
      }
    else{
      System.out.println("No");
    }
  }
}

5)

import java.util.Scanner;
public class lab3
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter year ");
    int year = sc.nextInt();
    if((year%4==0 && year%100!=0)||year%400==0){
    System.out.println(year+" is a leap year ");
    }
    else{
    System.out.println(year+ " is not a leap year ");
  }
 }
}

6)

import java.util.Scanner;
public class lab3
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner (System.in);
    int num = sc.nextInt();
    if(num>0 && num%2==0){
      System.out.println("Number is positive and even");
    }
    else if(num<0 && num%2==0){
      System.out.println("Number is negative and even");
    }
    
    else if(num<0 && num%2!=0){
      System.out.println("Number is negative and odd");
    }
    else if(num>0 && num%2!=0){
      System.out.println("Number is positive and odd");
    }
    else{
      System.out.println("Number is zero");
    }
  }
}

7)

import java.util.Scanner;
public class lab3
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number");
    int x = sc.nextInt();
    if(x<0){
      System.out.println("Output: "+x*2);
    }
    else if(x>=0 && x<2){
       System.out.println("Output: "+(x+1));
    }
    else if(x>=2 && x<5){
     System.out.println("Output: "+((x*x)-1));
    }
    else{
      System.out.println("Output: "+(3*(x*x)+2));
    }
  }
}

8)

import java.util.Scanner;
public class lab3
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter ID: ");
        int id = sc.nextInt();  
        int year = id / 1000000;
        int ssn = (id / 100000)%10 ;
         if(ssn==1){
        System.out.println("Student joined BRAC in Spring "+""+ year);
        }                  
        else if(ssn==2){
        System.out.println("Student joined BRAC in Fall "+""+ year);
        }                    
        else if(ssn==3){
        System.out.println("Student joined BRAC in Summer "+""+ year);
        }
         else{
           System.out.println("Invalid Id");
         }
    }
}

9)

import java.util.Scanner;
public class lab3
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter age: ");
    int age = sc.nextInt();
    System.out.println("Enter amount: ");
    int amount = sc.nextInt();
    double tax1 = (0.05*amount);
    double tax2 = (0.1*amount);
    if(age<18){
      System.out.println("Your tax amounts in 0 Tk");
    }
    if(amount<10000){
      System.out.println("Your tax amounts in 0 Tk");
    }
    else if(amount>=10000 && amount<=20000){
      System.out.println("Your tax amounts in "+tax1+" Tk");
    }
    else{
      System.out.println("Your tax amounts in "+tax2+" Tk");
    }
  }
}

10)

import java.util.Scanner;
public class lab3
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter fraction number 1: ");
    float f1 = sc.nextFloat();
    System.out.print("Enter fraction number 2: ");
    float f2 = sc.nextFloat();
    System.out.print("Enter fraction number 3: ");
    float f3 = sc.nextFloat();
    if(f1>f2 && f1>f3 && f3<f1 && f3<f2){
      System.out.println("Maximum number is "+ f1);
      System.out.println("Minimum number is "+ f2);
    }
    else if(f2>f1 && f2>f3 && f3<f1 && f3<f2){
      System.out.println("Maximum number is "+ f2);
      System.out.println("Minimum number is "+ f3);
    }
    else if(f3>f1 && f3>f3 && f1<f3 && f1<f2){
      System.out.println("Maximum number is "+ f3);
      System.out.println("Minimum number is "+ f1);
    }
    else if(f3>f1 && f3>f2 && f2<f1 && f2<f3){
      System.out.println("Maximum number is "+ f3);
      System.out.println("Minimum number is "+ f2);
    }
    else if(f1>f2 && f1>f3 && f2<f1 && f2<f3){
      System.out.println("Maximum number is "+ f1);
      System.out.println("Minimum number is "+ f2);
    }
    else if(f2>f1 && f2>f3 && f1<f3 && f1<f2){
      System.out.println("Maximum number is "+ f2);
      System.out.println("Minimum number is "+ f1);
    }
  }
}

11)

import java.util.Scanner;
public class lab3
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter angle 1: ");
    int ang1 = sc.nextInt();
    System.out.println("Enter angle 2: ");
    int ang2 = sc.nextInt(); 
    System.out.println("Enter angle 3: ");
    int ang3 = sc.nextInt();
    
    if(ang1==ang2 && ang2==ang3 && ang1==ang3){
      System.out.println("This is an Equilateral triangle");
    }
    else if(ang1==ang2 || ang2==ang3 || ang1==ang3){
      System.out.println("This is an Isoceles triangle");
    }
    else{
      System.out.println("This is a Scalene triangle");
    }
  }
}

12)

import java.util.Scanner;
public class lab3
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Amount to be paid in Taka: ");
    int x = sc.nextInt();
    System.out.println("Amount paid: ");
    int y = sc.nextInt();
    if(y<x){
      System.out.println("Please pay "+ (x-y) +" taka more");
    }
    else if(x==y){
      System.out.println("The returned amount is 0 taka");
    }
    else{
      int change = y-x;
      System.out.println("The returned amount is "+ change +" taka more");
      int hundred = change / 100;
      change %= 100;
      int fifty = change / 50;
      change %= 50;
      int twenty = change / 20;
      change %= 20;
      int ten = change / 10;
      change %= 10;
      int five = change / 5;
      change %= 5;
      int two = change / 2;
      change %= 2;
      int one = change;
      System.out.println("100 taka note: "+ hundred);
      System.out.println("50 taka note: "+ fifty);
      System.out.println("20 taka note: "+ twenty);
      System.out.println("10 taka note: "+ ten);
      System.out.println("5 taka coin: "+ five);
      System.out.println("2 taka coin: "+ two);
      System.out.println("1 taka coin: "+ one);
    }
  }
}


13)

import java.util.Scanner;
public class lab3
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter number 1: ");
    int num1 = sc.nextInt();
    System.out.println("Enter number 2: ");
    int num2 = sc.nextInt();
    System.out.println("Enter number 3: ");
    int num3 = sc.nextInt();
      if(num1==num2 && num2==num3 && num1==num3){
      System.out.println("All numbers are equal");
    }
    else if(num1==num2 || num2==num3 || num1==num3){
      System.out.println("Neither all are equal or different");
    }
    else{
      System.out.println("All numbers are different");
    }
  }
}


