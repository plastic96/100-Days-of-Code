import java.util.Scanner;

class InserSort
{
  public static void main()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no. of elements in the array: ");
    int n =  sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter array: ");
    for(int i = 0; i <n; i++)
    {
      arr[i] = sc.nextInt();
    }
    
    arr = sort(arr);
    System.out.println("Sorted array is: ");
    for(int i = 0; i <n; i++)
    {
      System.out.print(arr[i]+"\t");
    }
    System.out.println();
  }//end of main

  public static int[] sort(int a[])
  {
    for(int i = 1; i< a.length; i++)
    {
      int key = arr[i];
      int j = i-1;
      while(j>=0 && arr[j]<key)
      {
        a[i+1] = a[i];
        j--;
      }
      a[j+1] = key
    }
    return a;
  }//end of sort
}//end of class
  
