1)import java.util.Scanner;
public class lab5
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
   System.out.println("Enter number");
    int N = sc.nextInt();
    int prime=0;
    for(int i=2;prime<N;i++){
      int count = 0;
      for(int j=1;j<=i;j++){
        if(i%j==0){
          count++;
        }
      }
      if(count==2){
        System.out.println(i);
        prime++;
      }
    }
  }
}


2)import java.util.Scanner;
public class lab5
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int n = sc.nextInt();
    int y = 0;
    int sum = 0;
    for(int i=1; i<=n;i++){
      sum = (i*(i+1)/2);
      y-=sum;
    }
    System.out.println("The value of y:"+y);
  }
}


3)import java.util.Scanner;
public class lab5
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    boolean loop = true;
    while(loop){
      System.out.println("Enter number");
      int n = sc.nextInt();
      if(n%2!=0){
        break;
      }
      int divcount = 0;
      for(int i=1;i<=n;i++){
        if(n%i==0){
          divcount++;
        }
      }
       System.out.println(n+" has "+divcount+" divisors");
    }
  }
}


4)import java.util.Scanner;
public class lab5 
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for (int i=0;i<n;i++){
      int x=sc.nextInt();
      int y=sc.nextInt();
      int total=0;
      if (x%2==0){
        x+=1;
      }
      for (int count=0;count<y;count++){
        total+=x;
        x+=2;
      }
      System.out.println(total);
    }
  }
}


5)import java.util.Scanner;
public class lab5
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter width");
    int w = sc.nextInt();
    System.out.println("Enter length");
    int l = sc.nextInt();
    for(int i=1;i<=l; i++){
      for(int j=1;j<=w; j++){
        System.out.print(j + " ");
      }
        System.out.println();
    }
  }
}

6)import java.util.Scanner;
public class lab5
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int n = sc.nextInt();
    for(int i=1;i<=n; i++){
      for(int j=1;j<=n-i; j++){
        System.out.print(" ");
      }
      for(int k=1;k<=i;k++){
        System.out.print(k);
      }
      System.out.println();
    }
  }
}


7)import java.util.Scanner;
public class lab5
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int n = sc.nextInt();
    for(int i=1;i<=n; i++){
      for(int j=1;j<=n-i; j++){
        System.out.print(" ");
      }
      for(int k=1;k<=2*i-1;k++){
        System.out.print(k);
      }
      System.out.println();
    }
  }
}


8)import java.util.Scanner;
public class lab5
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int n=sc.nextInt();
    int e=sc.nextInt();
    int total=0;
    int num=0;
    int num1=0;
    int digit=0;
    for (int i=n;i<=e;i++){
      num=i;
      num1=i;
      total=0;
      digit=0;
      while (num1>0){
        num1=num1/10;
        digit++;
      }     
      for (int j=1;j<=digit;j++){
        total+=Math.pow(num%10,digit);
        num=num/10;
      }
      if (total==i){
        System.out.println(i);
      }
    }
  }
}



