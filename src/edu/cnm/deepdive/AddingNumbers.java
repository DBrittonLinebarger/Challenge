package edu.cnm.deepdive;

public class AddingNumbers {

  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i <= 100; i++)  {
      sum = sum + i; //sum += i;
    }
    System.out.println("The sum of 1 to 100 is " +  sum);
  }

}
