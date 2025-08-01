1) a)

import java.util.Scanner;
public class lab4
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int i = 24;
    while(i>=-6){
      if(i==-6){
      System.out.print(i);
      break;
      }
      else{
      System.out.print(i+", ");
      i-=6;
      }
    }
  }
}


b)

import java.util.Scanner;
public class lab4
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int i = -10;
    while(i<=20){
      if(i==-20){
      System.out.print(i);
      break;
      }
      else{
      System.out.print(i+", ");
      i+=5;
      }
    }
  }
}


2)

import java.util.Scanner;
public class lab4
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
     System.out.println("n =");
    int n = sc.nextInt();
    int sum = 0;
       System.out.println("Input the "+n+" numbers :");
    for(int i =1; i<=n; i++){
      int num = sc.nextInt();
     sum+=num;
    }
     System.out.println("The sum of" +n+ " no is:"+ sum);
      System.out.println("The Average is: "+ sum/n);
  }
}

3)

import java.util.Scanner;
public class lab4
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
     for(int i= 1; i<=n; i++){
       int num = sc.nextInt();
       int square=num*num;
       System.out.println("Enter number:"+ num);
       System.out.println(num+"^2"+"="+square);
       if(num<0){
         System.out.println();
       }
     }
  }
}

4)

import java.util.Scanner;
public class lab4
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number");
    int num = sc.nextInt();
    for(int i= 1; i<=num;i++){
      if(num%i ==0){
        System.out.println(i);
      }
    }
  }
}

5)

import java.util.Scanner;
public class lab4
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an Integer");
    int n = sc.nextInt();
    int negative = 0;
    int positive = 0;
    for(int i =1;i<=n;i++){
       System.out.println("Enter Number "+i+":");
      int num=sc.nextInt();
      if(num>0){
        positive++;
      }
      else{
        negative++;
      }
    }
    System.out.println(negative+" Negative numbers");
        System.out.println(positive+" Non Negative numbers");
  }
}


6)

import java.util.Scanner;
public class lab4
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an Integer");
    int n = sc.nextInt();
    int sum = 0;
    System.out.println("The odd numbers are:");
    for(int i =1; i<=n;i+=2){
      System.out.println(i);
      sum+=i;
    }
  System.out.println("The sum of odd natural numbers up to " +n+" is: "+ sum);
  }
}

7)

import java.util.Scanner;
public class lab4
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    for(int i =1; i<=10;i++){
      System.out.println("Enter number: "+i);
      int n = sc.nextInt();
       sum+=n;
      System.out.println("Sum = "+ sum);
    }
  }
}

8)

import java.util.Scanner;
public class lab4
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i =0; i<=n;i++){
      if(i%5==0 && i%3!=0){
        System.out.println(i);
      }
    }
  }
}


9)import java.util.Scanner;
public class lab4
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number");
    int num = sc.nextInt();
    int i =0;
    while(num!=0){
      i++;
      num=num/10;
    }
       System.out.println("Total digits= "+i);
  }
}

10)

import java.util.Scanner;
public class lab4
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number");
    int num1 = sc.nextInt();
    int num2 = num1;
    int i = 0;
    while(num1!=0){
      i++;
      num1=num1/10;
    }
    int num3 = i-1;
    while(num2>=0){
      if(num2!=0 && num3>0){
        System.out.print(num2/(int)Math.pow(10, num3)+",");
        num2=num2%(int)Math.pow(10, num3);
        num3-=1;
      }
      else{
        System.out.print(num2/(int)Math.pow(10, num3));
        num3=0;
        break;
      }
    }
  }
}



11) a)

import java.util.Scanner;
public class lab4
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number");
    int num = sc.nextInt();
    int sum=0;
    if(num%1==0 && num%2!=0 && num!=1 || num==2){
      for(int i =1; i<=num;i++){
      }
      System.out.println(num+" is a prime number");
    }
    else{
      System.out.println(num+" is not a prime number");
    }
  }
}

b)

import java.util.Scanner;
public class lab4
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number");
    int num = sc.nextInt();
    int sum=0;
    for(int i =1; i<=num-1;i++){
      if(num%i==0){
        sum+=i;
      }
    }
    if(sum==num){
      System.out.println(num+" is a perfect number");
    }
    else{
      System.out.println(num+" is not a perfect number");
    }
  }
}
