package Srini;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingwithScanner {
   public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the length of the array:");
//      int length = s.nextInt();
      int [] myArray = new int[] {};
      System.out.println("Enter the elements of the array:");

      for(int i=0; i<4; i++ ) {
         myArray[i] = s.nextInt();
      }

      System.out.println(Arrays.toString(myArray));
   }
}