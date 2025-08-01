1) a,b

import java.util.Arrays;
import java.util.Scanner;
public class lab7
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter N");
    int N = sc.nextInt();
    int [] arr1 = new int [N];
    for(int i=0;i<N;i++){
      arr1[i] = sc.nextInt();
    }
    for(int j=0;j<N;j++){
    System.out.println(j+": "+arr1[j]);
    }
    int newNum = sc.nextInt();
    int [] arr2 = new int[N+1];
    for(int k=0;k<N;k++){
      arr2[k] = arr1[k];
    }
    arr2[N] = newNum;
    System.out.println(Arrays.toString(arr2));
  }
}

2)import java.util.Arrays;
import java.util.Scanner;
public class lab7
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter N");
    int [] arr1 = {9,-5,7,9,-5,5,7};
    for(int i=0;i<arr1.length;i++){
      for(int j=0;j<i;j++){
        if(arr1[i]==arr1[j]){
          arr1[i]=0;
        }
      }
    }
    System.out.println(Arrays.toString(arr1));
  }
}


3)

a)import java.util.Arrays;
import java.util.Scanner;
public class lab7
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter N");
    int N = sc.nextInt();
    int [] arr1 = new int [N];
    for(int i=0;i<N;i++){
      arr1[i]=sc.nextInt();
    }
    int [] arr2 = new int[N];
    for(int k=0;k<N;k++){
      arr2[k] = arr1[N-1-k];
    }
    System.out.println(Arrays.toString(arr2));
  }
}

b)import java.util.Arrays;
import java.util.Scanner;
public class lab7
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter N");
    int N = sc.nextInt();
    int [] arr1 = new int [N];
    for(int i=0;i<N;i++){
      arr1[i]=sc.nextInt();
    }
    for(int k=0;k<N/2;k++){
      int temp = arr1[k];
      arr1[k] = arr1[N-1-k];
      arr1[N-1-k] = temp;
    }
    System.out.println(Arrays.toString(arr1));
  }
}

4)import java.util.Arrays;
import java.util.Scanner;
public class lab7
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter N");
    int size = sc.nextInt();
    int [] arr1 = new int[size] ;
    for(int i=0;i<size;i++){
      int elem = sc.nextInt();
      arr1[i]=elem;
      if(arr1[i]>0){
        arr1[i]=1;
      }
      else if(arr1[i]<0){
        arr1[i]=0;
      }
    }
    System.out.println(Arrays.toString(arr1));
  }
}

5)import java.util.Arrays;
import java.util.Scanner;
public class lab7
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter size");
    int size = sc.nextInt();
    int [] arr1 = new int[size] ;
    for(int i=0;i<size;i++){
      arr1[i]= sc.nextInt();
    }
    System.out.println("Enter number");
    int num = sc.nextInt();
    boolean b1 = false;
    for(int i=0;i<size;i++){
      if(arr1[i]==num){
        System.out.println(num+"is at index"+i);
        b1=true;
        break;
      }
    }
    if(!b1){
      System.out.println("Element not found");
      
    }
  }
}

6)import java.util.Arrays;
import java.util.Scanner;
public class lab7
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter size");
    int size = sc.nextInt();
    double [] arr1 = new double[size] ;
    for(int i=0;i<size;i++){
      arr1[i]= sc.nextDouble();
    }
    double max = arr1[0];
    double min = arr1[0];
    double sum = 0;
    int in = 0;
    int dex = 0;
    for(int i=0;i<size;i++){
      sum+=arr1[i];
      if(arr1[i]>max){
        max=arr1[i];
        in = i;
      }
      if(arr1[i]<min){
        min=arr1[i];
        dex = i;
      }
    }
    double avg = sum/size;
    System.out.println("Maximum element " + max + " found at index " + in);
        System.out.println("Minimum element " + min + " found at index " + dex);
        System.out.println("Summation: " + sum);
        System.out.println("Average: "+ avg);
  }
}

7)import java.util.Arrays;
import java.util.Scanner;
public class lab7
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    int [] arr1 = {23,100,23,56,100};
    int [] arr2 = new int[arr1.length];
    int count = 0;
    for(int i =0;i<arr1.length;i++){
      boolean unq = true;
      for(int j =0;j<count;j++){
        if(arr1[i]==arr2[j]){
          unq = false;
        }
      }
      if(unq){
        arr2[count]=arr1[i];
        count++;
        }
      }
    int[]arr3 = new int[count];
    for(int i =0;i<count;i++){
      arr3[i] = arr2[i];
    }
    System.out.println(Arrays.toString(arr3));
  }
}

8)

import java.util.Scanner;

public class lab7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array 1");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        System.out.println("Enter the elements of array 1");
        for (int i = 0;i<size;i++) {
            arr1[i] = sc.nextInt();
        }
        
        System.out.println("Enter the length of array 2");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter the elements of array 2");
        for (int i = 0;i<size2;i++) {
            arr2[i] = sc.nextInt();
        }
        boolean isSub = true;
        for (int i = 0; i < size2; i++) {
            boolean count = false; 
            for (int j = 0;j<size;j++) {
                if (arr2[i] == arr1[j]) {
                   count = true; 
                    break;
                }
            }
            if (!count) {
                isSub = false;
                break;
            }
        }
        if (isSub) {
            System.out.println("Array 2 is a subset of Array 1.");
        } else {
            System.out.println("Array 2 is not a subset of Array 1.");
        }
    }
}
