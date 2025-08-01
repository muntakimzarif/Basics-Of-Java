1)import java.util.Scanner;
public class lab6
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    for(int i=0;i<s1.length();i++){
      char c = s1.charAt(i);
      int at = (int)c;
      if(at>=97 && at<=122){
        at -=32;
      }
      System.out.print((char)at);
    }
  }
}

2)import java.util.Scanner;
public class lab6
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String count = "";
    for(int i=s1.length()-1;i>=0;i--){
      count+=s1.charAt(i);
    }
    if(s1.equals(count)){
      System.out.print (true);
    }
    else{
      System.out.print (false);
    }
  }
}


3)import java.util.Scanner;
public class lab6{
  public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    char ch2=s2.charAt(0);
    String temp="";
    int l=s1.length();
    s1+=ch2;
    for(int i=0;i<s1.length();i++){
      char ch=s1.charAt(i);
      if(ch!=ch2){
        temp+=ch;
      }
      else{
        System.out.println(temp);
        temp="";
      }
    }
  }
}


4)import java.util.Scanner;
public class lab6
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String count = "";
    for(int i=s1.length()-1;i>=0;i--){
      count+=s1.charAt(i);
    }
    System.out.print(count);
  }
}

5)import java.util.Scanner;
public class lab6{
  public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    String s1=sc.nextLine();
    String s2="";
    int countV=0;
    int countC=0;
    for(int i=0;i<s1.length();i++){
      char ch=s1.charAt(i);
      if(ch>='A' && ch<='Z'){
        ch=(char)(ch+32);
        s2+=ch;
      }
      else{
        s2+=ch;
      }
    }
    for(int i=0;i<s2.length();i++){
      char ch=s2.charAt(i);
      if(ch>='a' && ch<='z'){
        if(ch=='a'||  ch=='e'||  ch=='i'||  ch=='o'||  ch=='u'){
          countV++;
        }
        else{
          countC++;
        }
      }
    }
    if((countV>0 && countV%3==0) && (countC>0 && countC%5==0)){
      System.out.println("Aaarr! Me Plunder!");
    }
    else{
      System.out.println("Blimey! No Plunder!!");
    }
  }
}

6)import java.util.Scanner;
public class lab6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine() + " ";
    String s2 = "";
    String s3 = "";
    for (int i=0;i<s1.length();i++) {
      char ch = s1.charAt(i);
      if (ch!=' ') {
        s3 += ch;
      } else {
        s2 = s3+ " " +s2;
        s3 = "";
      }
    }
    String temp = "";
    for (int i=0;i<s2.length()-1;i++) {
       temp += s2.charAt(i);
    }
    System.out.println(temp);
  }
}

7)import java.util.Scanner ;
public class lab6{
  public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    String s3="";
    for(int i=0;i<s1.length();i++){
      boolean flag =true;
      char ch =s1.charAt(i);
      for(int j=0;j<s2.length();j++){
        char ch1=s2.charAt(j);
        if(ch!=ch1){
          flag=true;
        }
        else{
          flag=false;
          break;
        }
      }
      if(flag==true){
        s3+=ch;
      }
    }
    for(int i=0;i<s2.length();i++){
      boolean flag =true;
      char ch =s2.charAt(i);
      for(int j=0;j<s1.length();j++){
        char ch1=s1.charAt(j);
        if(ch!=ch1){
          flag=true;
        }
        else{
          flag=false;
          break;
        }
      }
      if(flag==true){
        s3+=ch;
      }
    }
    String s4="";
    for(int i=0;i<s3.length();i++){
      char ch=s3.charAt(i);
      s4+=(char)(ch-32);
    }
    System.out.println(s4);
  }
}

8)import java.util.Scanner;
public class lab6
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String temp = "";
    int count = 0;
    for(int i=0;i<s1.length();i++){
      char c = s1.charAt(i);
      if (Character.isLetter(c)) {
        if(count%2==0){
          temp += Character.toLowerCase(c);
        }
        else if(count%2!=0){
          temp += Character.toUpperCase(c);
        }
        count++;
      }
      else{
        temp+=c;
      }
    }
     System.out.println(temp);
  }  
} 

9)import java.util.Scanner;
public class lab6
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String temp = "";
    int count = 0;
    if(s1.length()<8){
      System.out.println("false");
      return;
    }
    int upper = 0;
    int lower = 0;
    int digit = 0;
    int esp = 0;
    for(int i=0;i<s1.length();i++){
      char c = s1.charAt(i);
      if(Character.isUpperCase(c)){
        upper++;
      }
      else if(Character.isDigit(c)){
        digit++;
      }
      else if(Character.isLowerCase(c)){
        lower++;
      }
      else if(!Character.isLetterOrDigit(c)){
        esp++;
      }
    }
    if(upper>0 && lower>0&& digit>0 && esp>0){
      System.out.print("true");
    }
    else{
      System.out.print("false");
    
    }
  }
}
