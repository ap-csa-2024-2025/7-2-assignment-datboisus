import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  ArrayList<Integer> foo = new ArrayList<Integer>();
  foo.add(new Integer(6));
  foo.add(new Integer(5));
  foo.add(new Integer(4));
  foo.add(new Integer(3));
  foo.add(new Integer(2));
  foo.add(new Integer(1));
  
  for (int i = 0; i < foo.size; i++)
  {
    System.out.println(foo.get(i));
  }
  
  for (Integer N : foo)
  {
    System.out.println(n);
    System.out.println(foo.intValue());
  }

  public static void main(String[] args)
  {
    int[] jennys = {8,6,7,5,3,0,9};

    for (int i = 0; i < jennys.length; i++)
    {
      System.out.println(jennys[i]);
    }

    for (int n : jennys)
    {
      System.out.println(n);
    }











    Scanner sc = new Scanner(System.in);
    String input = "";

    while (!input.equals("STOP"))
    {
      System.out.println("infinite loop! replace with your code");
    }
  }

  // Problem 2 - HighestNum
  public static Integer highestNum(ArrayList<Integer> arr)
  {
    ArrayList<Integer> high = new ArrayList<Integer>();
    for (Integer N : arr)
    {
      if (N > n)
      {
        n = N;
      }
    }
  }

  // Problem 3 - getEvens
  public static ArrayList<Integer> getEvens(final ArrayList<Integer> arr)
  {
    ArrayList<Integer> ans = new ArrayList<Integer>();
    for (Integer N : arr)
    {
      if (N.intValue % 2 == 0)
      {
        ans.add(N);
      }
    }

  }
}
